package edu.octavio_carbajal.reto3.diccionario.proces;

import java.util.Arrays;

public class DiccionarioDePalabras {
    /**
     * aqui se declaran los arreglos en privado para poder darles uso despues
     */
    private  String[] palabras;
    private  String[] significados;

    public DiccionarioDePalabras(String[] palabras, String[] significados) {
        this.palabras = palabras;
        this.significados = significados;
    }
    private int buscarIndex(String palabra){
        int indice = 0;
        while (indice < palabras.length) {
            if(palabra.equals(palabras[indice]))
                return indice;
            indice++;
        }
        return -1;
    }

    public String darBusqueda(String palabra){
        /**
         * aqui se busca la palabra que ingresa el usuario, en caso de que el usuario no las escribiera bien
         * o pone una que no esta, lanza el mensaje la palabra no esta disponible y repite el proceso
         */
        return buscarSignificado(buscarIndex(palabra));
    }
    private String buscarSignificado(int indice){
        if(indice == -1) {
            return "Esta palabra no esta disponible";
        }
        return significados[indice];
    }

    public void imprimirArrays() {
        Arrays.stream(palabras).forEach(System.out::println);
    }
    public void contadorCaracteres(){
        /**
         * esto permite hacer el conteo de carecteres de las palabras conectando directamente con el ARAYS.ASLIST
         */
        Arrays.stream(palabras)
                .forEach(palabra -> {
                    int indice = Arrays.asList(palabras).indexOf(palabra);
                    String significado = significados[indice];
                    System.out.println(palabra + " - Cantidad de caracteres: " + palabra.length() +
                            ". Cantidad de caracteres del significado: " + significado.length());
                });
    }
}