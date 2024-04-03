package edu.octavio_carbajal.reto7.proces;

public class Logaritmo extends Division {
    /**
     * se realiza el logaritmo por medio de 2 valores
     * @param valor1
     * @param valor2
     * @return
     */
    @Override
    public int calcular(int valor1, int valor2) {
        if (valor1 <= 1 || valor2 <= 0)
            throw new ArithmeticException("El logaritmo no está definido para los valores proporcionados");

        int logaritmo = 0;
        int argumento = valor1;
        while (argumento > 1) {
            argumento = super.calcular(argumento, valor2);
            logaritmo++;

        }
        return logaritmo;
    }
}
