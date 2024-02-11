package edu.octavio_carbajal.reto3.columnas.ui;


import edu.octavio_carbajal.reto3.columnas.proces.MatrizOperaciones;

import java.util.Scanner;

public class CLI {
    private Scanner scanner;

    public CLI() {
        this.scanner = new Scanner(System.in);
    }

    public void getInputAndExecute(MatrizOperaciones operaciones) {
        /**
         * aqui el usuario ingresa el numero de filas y de columnas y muestra el resultado
         * se establece el tamaño de la matriz y se muestra la matriz generada aleatoriamente
         */
        System.out.println("Ingrese la cantidad de filas");
        int filas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int columnas = scanner.nextInt();
        operaciones.setTamañoMatriz(filas, columnas);
        operaciones.generarMatrizRamdom();

        System.out.println("\nLa matriz generada es:");
        displayMatriz(operaciones.getMatriz());
        System.out.println("\nConteo de numero pares e impares por fila:");
        /**
         * aqui se muestra el conteo de pares e impares por fila
         */
        displayConteoFila(operaciones.getMatriz());
        System.out.println("\nConteo de numero pares e impares por columna");
        /**
         * aqui se muestra el conteo de pares e impares por columna
         */
        dysplayConteoColumna(operaciones.getMatriz());
        /**
         * gracias a esto se muestra la suma de los numeros de la matriz
         */
        int sumaTotal = calcularSumaTotal(operaciones.getMatriz());
        System.out.println("\nLa suma total de los valores del vectore es:" + sumaTotal);
    }

    private void displayMatriz(int[][] matriz) {
        /**
         * aqui utilizamos el .length para determinar el numero de elementos de la matriz
         */
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%-5d", matriz[i][j]);
            }
            System.out.println();
        }
    }
    private void displayConteoFila(int[][] matriz){
        /**
         * nuevamente usamos .length para ir guardando el conteo de pares e impares por fila
         */
        for (int i = 0; i < matriz.length; i++) {
            int pares = 0;
            int impares = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0){
                    pares++;
                } else {
                    impares++;
                }

            }
            System.out.printf("Cantidad de pares: %d, impares: %d en la fila %d%n",pares, impares, i + 1);
        }
    }
    private void dysplayConteoColumna(int[][] matriz){
        /**
         * aqui es lo mismo que la anterior pero ahora el por columna
         */
        for (int j = 0; j < matriz[0].length; j++) {
            int pares = 0;
            int impares = 0;
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }else {
                    impares++;
                }
            }
            System.out.printf("Cantidad de pares: %d, impares; %d en la columna %d%n", pares, impares, j + 1);
        }
    }
    private int calcularSumaTotal(int[][] matriz){
        int suma = 0;
        for (int[] fila: matriz){
            for (int num: fila){
                suma += num;
            }
        }
        return suma;
    }
}