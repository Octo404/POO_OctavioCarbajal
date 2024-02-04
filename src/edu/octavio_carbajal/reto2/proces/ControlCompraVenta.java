package edu.octavio_carbajal.reto2.proces;

public class ControlCompraVenta {
    /**
     * adentro de la clase tenemos la variable sumaventa que va a sumar el total de dinero de las ventas
     * tambien esta sumacompra que hara lo mismo pero es de cuanto nos hemos gastado en comprar
     * sumacajasventa es la acumulacion de cajas que se compran
     * sumacajasventa es la acumulacion de cajas que se venden
     **/
    static double sumaventa = 0;
    static double sumacompra = 0;
    static  int sumacajascompra = 0;
    static int sumacajasventa = 0;

    /**
     *
     * @param cajascompra el numero de cajas que vas a comprar
     * @param preciocajascompra el precio que tienen las cajas que vas a comprar
     * @return montocompra que es el precio de las cajas que compraste
     */
    public static double precioCajaCompra(int cajascompra, double preciocajascompra){
        double montocompra = cajascompra * preciocajascompra;
        sumacajascompra += cajascompra;
        sumacompra += montocompra;
        return montocompra;
    }

    /**
     *
     * @return sumacajascompra te da el total de cajas que has comprado
     */
    public static int numeroCajasCompra(){
        return sumacajascompra;
    }

    /**
     *
     * @return sumacajasventa te da el total de cajas vendidas
     */
    public static int numeroCajasVenta(){
        return sumacajasventa;
    }

    /**
     *
     * @return sumaventa te da el dinero que has generado por vender cajas
     */

    public static double ingresosoVentas(){
        return sumaventa;
    }

    /**
     *
     * @return sumacompra te da el total de dinero gastado en las cajas compradas totales
     */
    public static double egresosPorCompra(){
        return sumacompra;
    }

    /**
     *
     * @param cajasventa el numero de cajas que vas a vender
     * @param preciocajasventa el precio de las cajas que vas a vender
     * @return montoventa es el dinero que ganaste por el numero de cajas que decidiste vender en esa operacion
     */
    public static double precioCajaVenta(int cajasventa, double preciocajasventa){
        double montoventa = cajasventa * preciocajasventa;
        sumacajasventa += cajasventa;
        sumaventa += montoventa;
        return montoventa;
    }

    /**
     *
     * @return la resta de el dinero ganado y el perdido lo cual es el total de la caja
     */
    public static double montoCaja(){
        return sumaventa - sumacompra;
    }
}