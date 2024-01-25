package edu.octavio_carbajal.reto1.ui;

import edu.octavio_carbajal.reto1.process.CalculadoraMasa;

import java.util.Scanner;

public class CLI {
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
        Scanner scanner = new Scanner(System.in);
        showMenu();
        int seleccion = 0;
        seleccion = scanner.nextInt();
        if (seleccion == 1) {
            System.out.println("Ingrese su altura en centimetros");
            double altura = scanner.nextDouble();
            System.out.println("Ingrese su peso en Kilogramos");
            double peso = scanner.nextDouble();
            double imc = CalculadoraMasa.calcularMasaCorporal(peso, altura);
            System.out.println("tu imc es:"+imc);
        } else if (seleccion == 2) {
            /*char sexo = scaner.next().charAt(0);*/

        }

    }
}
