package edu.octavio_carbajal.reto7.ui;

import edu.octavio_carbajal.reto7.proces.Calculadora;

import java.util.Scanner;

public class CLI {
    private Calculadora procesador;
    private Scanner scanner;

    public CLI() {
        procesador = new Calculadora();
        scanner = new Scanner(System.in);
    }

    // Método para mostrar el menú de opciones
    public void mostrarMenu() {
        System.out.println("Calculadora");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Exponente");
        System.out.println("6. Logaritmo");
        System.out.println("7. Raíz cuadrada");
        System.out.println("0. Salir");
    }

    // Método para leer la opción del usuario
    public int leerOpcion() {
        System.out.print("Elija una opción: ");
        return scanner.nextInt();
    }

    // Método para leer un número del usuario
    public double leerNumero() {
        System.out.print("Ingrese un número: ");
        return scanner.nextDouble();
    }

    // Método para ejecutar la calculadora
    public void ejecutarCalculadora() {
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = leerOpcion();
            double num1, num2, resultado;
            switch (opcion) {
                case 1:
                    num1 = leerNumero();
                    num2 = leerNumero();
                    resultado = procesador.sumar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    num1 = leerNumero();
                    num2 = leerNumero();
                    resultado = procesador.restar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    num1 = leerNumero();
                    num2 = leerNumero();
                    resultado = procesador.multiplicar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    num1 = leerNumero();
                    num2 = leerNumero();
                    resultado = procesador.dividir(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 5:
                    num1 = leerNumero();
                    num2 = leerNumero();
                    resultado = procesador.exponente(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 6:
                    num1 = leerNumero();
                    resultado = procesador.logaritmo(num1);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 7:
                    num1 = leerNumero();
                    resultado = procesador.raizCuadrada(num1);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 0:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
