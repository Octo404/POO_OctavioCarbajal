package edu.octavio_carbajal.reto1.ui;

import edu.octavio_carbajal.reto1.process.CalculadoraMasa;

import java.util.Scanner;

public class CLI {
    /**
     * En esta clase se utilia para mostrar todos los datos al
     * usurio y darle a escogern entre distintas opciones
     * y tenga distintos resultados
     */
    public static void showMenu(){
        System.out.println("******Bienvenido******");
        System.out.println("Escrinbe el numero de la opcion que deseas");
        System.out.println("1. indice de masa corporal");
        System.out.println("2. indice de masa corporal magra");
        System.out.println("3. metabolismo basal");
        System.out.println("4. salir");
        System.out.println("***********************");

    }
    public static void lauchAPP(){
        /**
         * Esta parte permite dar inicio a los que seria la interfas del usuario
         */
        Scanner scanner = new Scanner(System.in);
        showMenu();
        int seleccion = 0;
        seleccion = scanner.nextInt();
        if (seleccion == 1) {
            /**
             * Aqui basicamente se le piden los datos al usuario
             * y se almacenan para las operaciones
             */
            System.out.println("Ingrese su altura en centimetros");
            double altura = scanner.nextDouble();
            System.out.println("Ingrese su peso en Kilogramos");
            double peso = scanner.nextDouble();
            double imc = CalculadoraMasa.calcularMasaCorporal(peso, altura);
            System.out.println("tu imc es:"+imc);
        } else if (seleccion == 2) {
            /**
             * Aqui igualmente se almacenan los datos solicitados con
             * la diferencia de que ahora se le pide al usuario el sexo
             */
            System.out.println("ingrese su peso en kilogramos");
            double peso = scanner.nextDouble();
            System.out.println("ingrese su altura el centimetros");
            double altura = scanner.nextDouble();
            System.out.println("¿cual el su sexo?");
            System.out.println("m ó f");
            char sexo = scanner.next().charAt(0);
            double masaMagra = CalculadoraMasa.masaMagra(peso, altura, sexo);
            System.out.println("Su masa corporal magra es"+ masaMagra);
        } else if (seleccion == 3) {
            /**
             * Aqui se piden los dato al usuario agragando el dato de la edad
             */
            System.out.println("Ingrese su peso el kilogramos");
            double peso = scanner.nextDouble();
            System.out.println("Ingrese su altura en centimetros");
            double altura = scanner.nextDouble();
            System.out.println("Ingrese su edad");
            int edad = (int) scanner.nextDouble();
            System.out.println("Cual es su sexo");
            System.out.println("M ó F");
            char sexo = scanner.next().charAt(0);
            double metabolismoBasal = CalculadoraMasa.metabolismoBasal(peso, altura, edad, sexo);
            System.out.println("Su Metabolismo Basal es" + metabolismoBasal);
        } else if (seleccion == 4) {
            /**
             * Esta opcion da fin al programa
             */
            System.out.println("Fin de Programa");
        }
    }
}