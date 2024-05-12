package edu.octavio_carbajal.Evidencia3.ui;


import edu.octavio_carbajal.Evidencia3.process.JugadorCPU;
import edu.octavio_carbajal.Evidencia3.process.Tablero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Cli {
    private static Idioma texto = new Esp();
    private static final Scanner sc = new Scanner(System.in);
    static Tablero gato = new Tablero();
    static JugadorCPU CPU = new JugadorCPU();

    private static String randomizarInicio(String nombreJugador1, String nombreJugador2) {
        Random rand = new Random();
        return rand.nextInt(2) == 0 ? nombreJugador1 : nombreJugador2;
    }

    public static void lanzarApp() {
        System.out.println("Selecciona un idioma");
        System.out.println("1.Español");
        System.out.println("2.English");
        System.out.println("3.日本語(Japones");
        int lenguaje = sc.nextInt();
        switch (lenguaje) {
            case 1:
                texto = new Esp();
                break;
            case 2:
                texto = new Eng();
                break;
            case 3:
                texto = new Jap();
                break;
        }

        System.out.println(texto.JUGARUNJUGADOR);
        System.out.println(texto.JUGARDOSJUGADORES);
        System.out.println(texto.SELECCIONANUMPARAJUGAR);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                // Juego contra la CPU
                jugarContraCPU();
                break;
            case 2:
                // Juego entre dos jugadores
                jugarEntreDosJugadores();
                break;
            default:
                System.out.println(texto.SELECCIONNOVALIDA);
                break;
        }
    }

    private static void jugarContraCPU() {
        System.out.println(texto.INGRESANOMBRE1);
        String nombreJugador = sc.next();

        char simboloJugador = seleccionarSimbolo(nombreJugador);
        char simboloCPU = (simboloJugador == '@') ? 'X' : '@'; // Símbolo contrario al jugador humano

        while (!gato.todoLleno() && !gato.ganador(simboloJugador, simboloCPU)) {
            realizarTurnoJugador(nombreJugador, simboloJugador);

            if (gato.ganador(simboloJugador, simboloCPU) || gato.todoLleno()) {
                break;
            }

            realizarTurnoCPU(simboloCPU);
        }

        mostrarResultado(simboloJugador, simboloCPU);
    }

    private static void jugarEntreDosJugadores() {
        System.out.println(texto.INGRESANOMBRE1);
        String nombreJugador1 = sc.next();
        char simboloJugador1 = seleccionarSimbolo(nombreJugador1);

        System.out.println(texto.INGRESANOMBRE2);
        String nombreJugador2 = sc.next();
        char simboloJugador2 = (simboloJugador1 == '@') ? 'X' : '@'; // Símbolo contrario al primer jugador

        while (!gato.todoLleno() && !gato.ganador(simboloJugador1, simboloJugador2)) {
            realizarTurnoJugador(nombreJugador1, simboloJugador1);

            if (gato.ganador(simboloJugador1, simboloJugador2) || gato.todoLleno()) {
                break;
            }

            realizarTurnoJugador(nombreJugador2, simboloJugador2);
        }

        mostrarResultado(simboloJugador1, simboloJugador2);
    }

    private static char seleccionarSimbolo(String nombreJugador) {
        System.out.println(texto.HOLA + nombreJugador + texto.INGRESASIMBOLO1);
        System.out.println("1- @, 2- ♫, 3- +, 4- ☼, 5- #, 6- $, 7- %, 8- =, 9- !, 10- ©");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: return '@';
            case 2: return '♫';
            case 3: return '+';
            case 4: return '☼';
            case 5: return '#';
            case 6: return '$';
            case 7: return '%';
            case 8: return '=';
            case 9: return '!';
            case 10: return '©';
            default:
                System.out.println(texto.SELECCIONNOVALIDA);
                return '@';
        }
    }

    private static void realizarTurnoJugador(String nombreJugador, char simbolo) {
        gato.lineasTablero();
        System.out.println(texto.TURNOHUMANO + nombreJugador + simbolo );
        System.out.println(texto.SELECCIONALACASILLA);
        int seleccion = sc.nextInt();

        int fila = (seleccion - 1) / 3;
        int columna = (seleccion - 1) % 3;

        if (gato.jugadaValida(fila, columna)) {
            gato.hacerJugada(fila, columna, simbolo);
        } else {
            System.out.println(texto.CASILLAYAOCUPADA);
            realizarTurnoJugador(nombreJugador, simbolo);
        }
    }

    private static void realizarTurnoCPU(char simboloCPU) {
        List<int[]> movimientosPosibles = obtenerMovimientosPosibles(gato);

        // Si no hay movimientos posibles, salimos
        if (movimientosPosibles.isEmpty()) {
            return;
        }

        // Elegir un movimiento aleatorio de los movimientos posibles
        Random rand = new Random();
        int[] movimientoSeleccionado = movimientosPosibles.get(rand.nextInt(movimientosPosibles.size()));

        // Realizar el movimiento seleccionado por la CPU
        gato.hacerJugada(movimientoSeleccionado[0], movimientoSeleccionado[1], simboloCPU);

        System.out.println(texto.TURNOCPU + simboloCPU );
        gato.lineasTablero();
    }

    private static List<int[]> obtenerMovimientosPosibles(Tablero tablero) {
        List<int[]> movimientosPosibles = new ArrayList<>();

        for (int fila = 0; fila < Tablero.tamaño; fila++) {
            for (int columna = 0; columna < Tablero.tamaño; columna++) {
                if (tablero.jugadaValida(fila, columna)) {
                    movimientosPosibles.add(new int[]{fila, columna});
                }
            }
        }

        return movimientosPosibles;
    }

    private static void mostrarResultado(char simboloJugador, char simboloOponente) {
        gato.lineasTablero();
        if (gato.ganador(simboloJugador, simboloOponente)) {
            System.out.println(texto.GANADOR);
        } else {
            System.out.println(texto.ELJUEGOTERMINOEMPATE);
        }
    }
}