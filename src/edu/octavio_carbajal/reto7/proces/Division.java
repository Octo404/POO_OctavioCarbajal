package edu.octavio_carbajal.reto7.proces;

public class Division extends Calculadora{
    /**
     * se realiza la division
     * @param n1 numero 1
     * @param n2 numero 2
     * @return
     */
    @Override
    public double calcular(double n1, double n2) {
        double cociente=0;
        while (n1>=n2) {
            n1 = new Resta().calcular(n1,n2);
            cociente++;
        }
        return cociente;
    }

    public int calcular(int valor1, int valor2) {
        return 0;
    }
}
