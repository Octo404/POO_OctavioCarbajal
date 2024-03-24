package edu.octavio_carbajal.reto7.proces;

public class RaizCuadrada extends Multiplicacion {
    /**
     * realiza la raiz cuadrada por medio de la multiplicacion
     * @param n1 numero 1
     * @param n2 numero 2
     * @return
     */
    @Override
    public double calcular(double n1, double n2) {
        double raiz;
        double pruebaPotencias = 0;
        double validacion = 0;
        double aproximacion = 1;

        while (pruebaPotencias < n1) {
            validacion = aproximacion;
            pruebaPotencias = 1;
            for (int i = 0; i < n2; i++) {
                pruebaPotencias = super.calcular(pruebaPotencias, aproximacion);
            }
            aproximacion++;
        }
        raiz = validacion;

        return raiz;
    }
}