package edu.octavio_carbajal.reto3.columnas.proces;

import java.util.Random;

public class MatrizOperaciones {
    /**
     * @filas muestra las filas
     * @columnas muestra las columnas
     * aqui se da inicio al arreglo bidimensional nombrado como matriz
     * @random permite crear numeros aleatorios
     */
    private int filas;
    private int columnas;
    private int[][] matriz;
    private Random random;

    public void setTamañoMatriz(int filas, int columnas){
        /**
         * esto ayuda a establecer el tamaño de la matriz
         */
        this.columnas = columnas;
        this.filas = filas;
        this.matriz = new int[filas][columnas];
        this.random = new Random();
    }

    public void generarMatrizRamdom(){
        /**
         * aqui se genera la matriz y se hace el conteo de conlumnas y filas
         */
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                matriz[i][j] = random.nextInt(100)+1;
            }
        }
    }
    public int[][] getMatriz(){
        return matriz;
    }
}
