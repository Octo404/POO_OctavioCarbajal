package edu.octavio_carbajal.reto11.proces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.*;

public class AnalizadorDeLibros {

    public static void analizar(String nombreArchivo) {
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            br.lines()
                    .map(AnalizadorDeLibros::normalizarTexto)
                    .flatMap(linea -> Arrays.stream(linea.split("\\s+")))
                    .filter(palabra -> palabra.matches("[a-záéíóúü]+"))
                    .map(String::toLowerCase)
                    .forEach(palabra -> frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprime las 10 palabras más utilizadas
        frecuenciaPalabras.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        // Conteo del total de todas las vocales disponibles en el libro
        long totalVocales = frecuenciaPalabras.keySet().stream()
                .flatMapToInt(String::chars)
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
        System.out.println("Total de vocales: " + totalVocales);

        // Imprime todas las palabras que empiecen en una vocal ordenadas alfabéticamente
        frecuenciaPalabras.keySet().stream()
                .filter(palabra -> "aeiou".indexOf(palabra.charAt(0)) != -1)
                .sorted()
                .forEach(System.out::println);

        // Imprime todas las palabras que tienen un número impar de letras
        frecuenciaPalabras.keySet().stream()
                .filter(palabra -> palabra.length() % 2 != 0)
                .forEach(System.out::println);

        // Encuentra la palabra más larga de todo el libro
        Optional<String> palabraMasLarga = frecuenciaPalabras.keySet().stream()
                .max(Comparator.comparingInt(String::length));
        palabraMasLarga.ifPresent(System.out::println);

        // Encuentra la palabra más corta de todo el libro
        Optional<String> palabraMasCorta = frecuenciaPalabras.keySet().stream()
                .min(Comparator.comparingInt(String::length));
        palabraMasCorta.ifPresent(System.out::println);

        // Identifica si hay al menos una palabra que cumpla ciertas condiciones
        boolean existePalabraCondiciones = frecuenciaPalabras.keySet().stream()
                .anyMatch(palabra -> palabra.length() >= 5 &&
                        "aeiou".indexOf(palabra.charAt(0)) != -1 &&
                        "aeiou".indexOf(palabra.charAt(palabra.length() - 1)) != -1);
        System.out.println("¿Existe una palabra que cumpla las condiciones? " + existePalabraCondiciones);
    }

    private static String normalizarTexto(String texto) {
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        textoNormalizado = textoNormalizado.replaceAll("[^\\p{ASCII}]", "");
        textoNormalizado = textoNormalizado.replaceAll("[^a-zA-Z ]", " ");
        return textoNormalizado;
    }
}