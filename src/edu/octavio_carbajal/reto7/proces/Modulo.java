package edu.octavio_carbajal.reto7.proces;

public class Modulo extends Calculadora{
    /**
     * obtiene el resudio de la division
     * @param n1 numero 1
     * @param n2 numero 2
     * @return
     */
    @Override
    public double calcular(double n1, double n2) {
        while (n1 >= n2 ){
            n1 = new Resta().calcular(n1, n2);
        }
        return n1;
    }
}
