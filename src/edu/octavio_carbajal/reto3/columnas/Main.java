package edu.octavio_carbajal.reto3.columnas;

import edu.octavio_carbajal.reto3.columnas.proces.MatrizOperaciones;
import edu.octavio_carbajal.reto3.columnas.ui.CLI;


public class Main {
    public static void main(String[] args) {
        /**
         * crea una instancia del CLI
         */
        CLI ui=new CLI();
        /**
         * crea una instancia de las operaciones de la matriz
         */
        MatrizOperaciones operaciones = new MatrizOperaciones();
        /**
         * obtiene la entrada del usuario y ejecuta las operaciones
         */
        ui.getInputAndExecute(operaciones);

    }
}