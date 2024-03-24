package edu.octavio_carbajal.reto7.ui;

import edu.octavio_carbajal.reto7.proces.*;

import java.util.Scanner;

public class CLI {
    private static final Scanner scanner = new Scanner(System.in);
    private static Textos textos = new Esp();

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
                Textos = new Esp();
                break;
            case 2:
                Textos = new Ingl();
                break;
            default:
                System.out.println("Opcion no disponible");
        }
    }
    private static double n1;
    private static double n2;

    public static void showMenu(){
        System.out.println(textos.MENU);
    }

    /**
     * opciones para cada operacion aritmetica
     */

    public static void launchCalculadora(){
        showMenu();
        int opcion = scanner.nextInt();
        Calculadora operacion = null;
        switch (opcion){
            case 1:
                System.out.println(textos.INGRESE_PRIMERNUM);
                n1 = scanner.nextDouble();

                System.out.println(textos.INGRESE_SEGUNDONUM);
                n2 = scanner.nextDouble();
                operacion = new Suma();
                break;
            case 2:
                System.out.println(textos.INGRESE_PRIMERNUM);
                n1 = scanner.nextDouble();

                System.out.println(textos.INGRESE_SEGUNDONUM);
                n2 = scanner.nextDouble();
                operacion = new Resta();
                break;
            case 3:
                System.out.println(textos.INGRESE_PRIMERNUM);
                n1 = scanner.nextDouble();

                System.out.println(textos.INGRESE_SEGUNDONUM);
                n2 = scanner.nextDouble();
                operacion = new Multiplicacion();
                break;
            case 4:
                System.out.println(textos.INGRESE_DIVIDENDO);
                n1 = scanner.nextDouble();

                System.out.println(textos.INGRESE_DIVISOR);
                n2 = scanner.nextDouble();
                operacion = new Division();
                break;
            case 5:
                System.out.println(textos.INGRESE_DIVIDENDO);
                n1 = scanner.nextDouble();

                System.out.println(textos.INGRESE_DIVISOR);
                n2 = scanner.nextDouble();
                operacion = new Modulo();
                break;
            case 6:
                System.out.println(textos.INGRESE_NUMERO);
                n1 = scanner.nextDouble();

                System.out.println(textos.INGRESE_EXPONENTE);
                n2 = scanner.nextDouble();
                operacion = new Potencia();
                break;
            case 7:
                System.out.println(textos.INGRESE_PRIMERNUM);
                n1 = scanner.nextDouble();

                System.out.println(textos.INGRESE_SEGUNDONUM);
                n2 = scanner.nextDouble();
                operacion = new Logaritmo();
                break;
            case 8:
                System.out.println(textos.INGRESE_NUMERO);
                n1 = scanner.nextDouble();
                n2 = 2;
                operacion = new RaizCuadrada();
            default:
                System.out.println(textos.ERROR);
        }
        if (operacion != null) {
            System.out.println(textos.EL_RESULTADO + operacion.calcular(n1, n2));
            System.out.println(textos.DESPEDIDA);
        } else {
            System.out.println(textos.ERROR);
        }
    }
}