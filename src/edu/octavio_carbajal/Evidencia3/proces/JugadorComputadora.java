package edu.octavio_carbajal.Evidencia3.proces;

public class JugadorComputadora {
    public int[] minimax(Tablero tablero, char jugadorMax, char jugadorMin) {
        int[] mejorMovimiento = new int[]{-1, -1};
        int mejorPuntaje = Integer.MIN_VALUE;

        for (int fila = 0; fila < Tablero.tamaño; fila++) {
            for (int columna = 0; columna < Tablero.tamaño; columna++) {
                if (tablero.jugadaValida(fila, columna)) {
                    tablero.hacerJugada(fila, columna, jugadorMax);
                    int puntaje = minimaxRecursivo(tablero, false, jugadorMax, jugadorMin);
                    tablero.hacerJugada(fila, columna, '-');

                    if (puntaje > mejorPuntaje) {
                        mejorPuntaje = puntaje;
                        mejorMovimiento = new int[]{fila, columna};
                    }
                }
            }
        }

        return mejorMovimiento;
    }

    private int minimaxRecursivo(Tablero tablero, boolean esMaximizador, char jugadorMax, char jugadorMin) {
        if (tablero.ganador(jugadorMax, jugadorMin)) {
            return esMaximizador ? 1 : -1;
        }
        if (tablero.todoLleno()) {
            return 0;
        }

        int mejorPuntaje = esMaximizador ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int fila = 0; fila < Tablero.tamaño; fila++) {
            for (int columna = 0; columna < Tablero.tamaño; columna++) {
                if (tablero.jugadaValida(fila, columna)) {
                    char jugador = esMaximizador ? jugadorMax : jugadorMin;
                    tablero.hacerJugada(fila, columna, jugador);
                    int puntaje = minimaxRecursivo(tablero, !esMaximizador, jugadorMax, jugadorMin);
                    tablero.hacerJugada(fila, columna, '-');

                    if (esMaximizador) {
                        mejorPuntaje = Math.max(mejorPuntaje, puntaje);
                    } else {
                        mejorPuntaje = Math.min(mejorPuntaje, puntaje);
                    }
                }
            }
        }

        return mejorPuntaje;
    }
}

