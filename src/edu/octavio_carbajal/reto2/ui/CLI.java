package edu.octavio_carbajal.reto2.ui;

import edu.octavio_carbajal.reto1.process.CalculadoraMasa;
import edu.octavio_carbajal.reto2.proces.ControlCompraVenta;

import java.util.Scanner;

public class CLI {
    /**
     * Es la interfaz del menu
     */
    public static void showMenu(){
        System.out.println("**************** Bienvenido ****************");
        System.out.println("Elige un numero de las opciones a calcular");
        System.out.println("1-Comprar cajas de papel");
        System.out.println("2-Vender cajas de papel");
        System.out.println("3-Mostrar reporte");
        System.out.println("4-salir del programa");
        System.out.println("********************************************");
    }

    /**
     * aqui es donde el usuario interactua con todo el programa con un bucle que acaba hasta que el usuario elija
     * la opcion 4 que es alir, hasta que eso no pase el programa no presentara errores.
     * Las variables que se declaran globalmente son para guardar los valores de los metodos de process para
     * mostrarlos al usuario en donde se necesita.
     */
    public static void launchAPP() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int cajasC;
        double preciocajascom;
        int cajasV;
        double preciocajasven;
        int opciones;
        int contadoroperaciones = 0;
        double ingresosv = 0;
        double egresosc = 0;
        double numcajascompra = 0;
        double numcajasventa = 0;
        do{
            showMenu();
            opciones = sc.nextInt();
            if (opciones == 1) {
                System.out.println("Numero de cajas a comprar");
                cajasC = sc.nextInt();
                System.out.println("Costo de las cajas a comprar");
                preciocajascom = sc.nextDouble();
                double montoC = ControlCompraVenta.precioCajaCompra(cajasC, preciocajascom);
                System.out.println("La compra por " + cajasC + " cajas al costo de $" + preciocajascom + " es igual a $" + montoC);
            } else if (opciones == 2) {
                System.out.println("Numero de cajas a vender");
                cajasV = sc.nextInt();
                System.out.println("Costo de las cajas a vender");
                preciocajasven = sc.nextDouble();
                double montoV = ControlCompraVenta.precioCajaVenta(cajasV, preciocajasven);
                System.out.println("La compra por "+cajasV+" cajas al costo de $"+preciocajasven+" es igual a $"+montoV);
            } else if (opciones == 3) {
                numcajascompra = ControlCompraVenta.numeroCajasCompra();
                System.out.println("Cantidad total de compras " +numcajascompra);
                numcajasventa = ControlCompraVenta.numeroCajasVenta();
                System.out.println("Cantidad total de ventas "+numcajasventa);
                ingresosv = ControlCompraVenta.ingresosoVentas();
                System.out.println("Ingresos generados por ventas " + ingresosv);
                egresosc = ControlCompraVenta.egresosPorCompra();
                System.out.println("Egresos generados por compra "+egresosc);
            } else if (opciones == 4) {
                System.out.println("Operaciones realizadas: "+contadoroperaciones);
                System.out.println("Cantidad total de ventas: "+ numcajasventa);
                System.out.println("Cantidad total de compras: "+numcajascompra);
                double montototal = ControlCompraVenta.montoCaja();
                System.out.println("Monto de la caja: $"+montototal);
                System.out.println("Ingresos generados por ventas " + ingresosv);
                System.out.println("Egresos generados por compra "+egresosc);
                System.out.println("********* Hasta luego usuario **********");
                Thread.sleep(5*1000);
                System.exit(0);
            }
            contadoroperaciones++;
        }while(true);
    }
}




