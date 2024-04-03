package edu.octavio_carbajal.reto7.proces;

public class Resta extends Calculadora{
    /**
     * realiza la resta y da pie a las demas clases
     * @param n1 numero 1
     * @param n2 numero 2
     * @return
     */

    @Override
    public double calcular(double n1, double n2) {
        return n1 - n2;
    }
}
