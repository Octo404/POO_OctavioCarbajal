package edu.octavio_carbajal.Evidencia3.proces;

public class Tablero {
    private char[][] grid;
    public static final int tamaño = 3;

    public Tablero() {
        grid = new char[tamaño][tamaño];
        iniciarTablero();
    }

    public void iniciarTablero() {
        for (int row = 0; row < tamaño; row++) {
            for (int col = 0; col < tamaño; col++) {
                grid[row][col] = '-';
            }
        }
    }

    public void lineasTablero() {
        System.out.println("-------------");
        for (int row = 0; row < tamaño; row++) {
            System.out.print("| ");
            for (int col = 0; col < tamaño; col++) {
                System.out.print(grid[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean jugadaValida(int row, int col) {
        return row >= 0 && row < tamaño && col >= 0 && col < tamaño && grid[row][col] == '-';
    }

    public boolean todoLleno() {
        for (int row = 0; row < tamaño; row++) {
            for (int col = 0; col < tamaño; col++) {
                if (grid[row][col] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean ganador(char simbolo1, char simbolo2) {
        // Verificar filas
        for (int fila = 0; fila < tamaño; fila++) {
            if (grid[fila][0] == simbolo1 && grid[fila][1] == simbolo1 && grid[fila][2] == simbolo1) {
                return true; // Hay una línea horizontal completa de simbolo1
            }
            if (grid[fila][0] == simbolo2 && grid[fila][1] == simbolo2 && grid[fila][2] == simbolo2) {
                return true; // Hay una línea horizontal completa de simbolo2
            }
        }

        // Verificar columnas
        for (int columna = 0; columna < tamaño; columna++) {
            if (grid[0][columna] == simbolo1 && grid[1][columna] == simbolo1 && grid[2][columna] == simbolo1) {
                return true; // Hay una línea vertical completa de simbolo1
            }
            if (grid[0][columna] == simbolo2 && grid[1][columna] == simbolo2 && grid[2][columna] == simbolo2) {
                return true; // Hay una línea vertical completa de simbolo2
            }
        }

        // Verificar diagonales
        if ((grid[0][0] == simbolo1 && grid[1][1] == simbolo1 && grid[2][2] == simbolo1) ||
                (grid[0][2] == simbolo1 && grid[1][1] == simbolo1 && grid[2][0] == simbolo1)) {
            return true; // Hay una línea diagonal completa de simbolo1
        }
        if ((grid[0][0] == simbolo2 && grid[1][1] == simbolo2 && grid[2][2] == simbolo2) ||
                (grid[0][2] == simbolo2 && grid[1][1] == simbolo2 && grid[2][0] == simbolo2)) {
            return true; // Hay una línea diagonal completa de simbolo2
        }

        return false; // No hay ninguna línea completa
    }



    public void hacerJugada(int row, int col, char symbol) {
        if (jugadaValida(row, col)) {
            grid[row][col] = symbol;
        }
    }
}

