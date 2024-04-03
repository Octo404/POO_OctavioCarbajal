package edu.octavio_carbajal.Evidencia2.ui;

import edu.octavio_carbajal.Evidencia2.Proces.*;
import edu.octavio_carbajal.reto7.ui.Esp;
import edu.octavio_carbajal.reto7.ui.Ingl;
import edu.octavio_carbajal.reto7.ui.Textos;

import java.util.Scanner;

public class CLI {
    private static final Scanner scanner = new Scanner(System.in);
    private static edu.octavio_carbajal.Evidencia2.ui.Textos textos = new edu.octavio_carbajal.Evidencia2.ui.Esp();

    /**
     * menu de seleccion de idioma
     */
    public  static void ShowMenuTextos(){
        System.out.println("Selecciona el idioma del programa");
        System.out.println("1-Espanol");
        System.out.println("2-English");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                Textos Textos = new Esp();
                break;
            case 2:
                Textos = new Ingl();
                break;
            default:
                System.out.println("Opcion no disponible");
        }
    }
    public static void showOptions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bienvenido a TecmiFlix!");
        System.out.println("Elige una opción:");
        System.out.println("1. Calcular el coste total");
        System.out.println("2. Salir");
        System.out.print("Introduzca su selección: ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                calculateTotalCost();
                break;
            case 2:
                System.out.println("Thank you for using TecmiFlix. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                showOptions();
                break;
        }
    }

    public static void calculateTotalCost() {
        int playMusica = getRandomNumber(20);
        int playPelicula = getRandomNumber(10);
        int readLibro = getRandomNumber(5);
        int playVideojuego = getRandomNumber(7);

        Producto[] productos = {
                new Musica("Musica 1", "Musica", 0.5, "Pop", false),
                new Pelicula("Pelicula 1", "Pelicula", 7, "Accion", false),
                new Libro("Libro 1", "libro", 5, "Novela", false),
                new Videojuegos("Juego 1", "Videojuego", 10, "Accion", false)
        };
        double totalCost = 0;
        for (Producto producto : productos) {
            totalCost += producto.CalcularCosto();
        }
        System.out.println("Costo total a pagar: $" + totalCost);
    }
    public static int getRandomNumber(int bound){
        return (int) (Math.random() * bound);
    }
}
