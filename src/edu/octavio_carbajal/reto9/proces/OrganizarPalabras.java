package edu.octavio_carbajal.reto9.proces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.*;

public class OrganizarPalabras {
    public Map<String, Integer> obtenerTop10Palabras(String fileName) {
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚüÜñÑ]", " "); // Eliminar caracteres no alfabéticos
                line = Normalizer.normalize(line, Normalizer.Form.NFD); // Normalizar para tratar acentos
                line = line.replaceAll("[^\\p{ASCII}]", ""); // Eliminar caracteres no ASCII (acentos normalizados)
                String[] words = line.trim().split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase(); // Convertir a minúsculas
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return sortByValue(wordCount);
    }

    private static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}