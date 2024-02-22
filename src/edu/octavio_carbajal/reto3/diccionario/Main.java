package edu.octavio_carbajal.reto3.diccionario;

import edu.octavio_carbajal.reto3.diccionario.proces.DiccionarioDePalabras;
import edu.octavio_carbajal.reto3.diccionario.ui.CLI;

public class Main {
    public static void main(String[] args) {
        /**
         * aqui se establce el arreglo y escribimos todas las palabras con sus significados
         */
        String[] palabras = {"Mar", "Payaso", "Marihuana", "Blanca", "Privilegio", "Circunferencia",
                "Tequila", "Rebote", "Prejuicio", "Chaqueta"};
        String[] significados = {"agua salada", "alguien muy gracioso", "una planta magica", "una persona privilegiada",
                "una persona blanca", "bebida alcoholisante", "algo redodondo", "lo que hace un resorte",
                "juzgar a alguien", "algo que usas para el frio"};
        DiccionarioDePalabras diccionario = new DiccionarioDePalabras(palabras, significados);
        try{
            CLI.launchApp(diccionario);
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
