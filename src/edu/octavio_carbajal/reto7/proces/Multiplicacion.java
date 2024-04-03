package edu.octavio_carbajal.reto7.proces;

public class Multiplicacion extends Calculadora {
    /**
     * realiza la multiplicacion
     * @param n1 numero 1
     * @param n2 numero 2
     * @return
     */
    @Override
    public double calcular(double n1, double n2) {
        double resultado=0;
        for (int i = 0; i < n2; i++){
            resultado= new Suma().calcular(resultado,n1);
        }
        return resultado;
    }
}
