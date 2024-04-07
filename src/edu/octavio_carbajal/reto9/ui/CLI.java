package edu.octavio_carbajal.reto9.ui;

import edu.octavio_carbajal.reto9.proces.OrganizarPalabras;
import edu.octavio_carbajal.reto9.proces.Recursos;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CLI {
    private static final Scanner sc = new Scanner(System.in);
    private static Idioma texto = new edu.octavio_carbajal.reto9.ui.Esp();

    private Scanner scanner;
    private OrganizarPalabras organizador;
    private Recursos recursos;

    public CLI() {
        scanner = new Scanner(System.in);
        organizador = new OrganizarPalabras();
        recursos = new Recursos();
    }

    public void run() {
        System.out.println("Bienvenido al analizador de libros.");
        System.out.println("Por favor, elija su idioma:");
        System.out.println("1. Inglés");
        System.out.println("2. Español");
        int languageChoice = scanner.nextInt();
        scanner.nextLine(); // Consume la nueva línea después de nextInt()

        switch (languageChoice) {
            case 1:
                System.out.println("Ha elegido inglés.");
                break;
            case 2:
                System.out.println("Ha elegido español.");
                break;
            default:
                System.out.println("Opción inválida. Saliendo del programa.");
                return;
        }

        List<String> books = recursos.getBooks();

        System.out.println("Seleccione un libro para analizar:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
        int bookChoice = scanner.nextInt();
        scanner.nextLine(); // Consume la nueva línea después de nextInt()

        if (bookChoice < 1 || bookChoice > books.size()) {
            System.out.println("Selección de libro inválida. Saliendo del programa.");
            return;
        }

        String bookFileName = books.get(bookChoice - 1);
        Map<String, Integer> topWords = organizador.obtenerTop10Palabras(bookFileName);

        System.out.println("Las 10 palabras más comunes en " + bookFileName + " son:");
        int count = 0;
        for (Map.Entry<String, Integer> entry : topWords.entrySet()) {
            if (count >= 10) {
                break;
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count++;
        }
    }
}