package edu.octavio_carbajal.reto1.process;

public class CalculadoraMasa {
    public static double calcularMasaCorporal(double peso, double altura){
        double metros = altura/100;
        double imc = peso/Math.pow(metros,2);
        if (imc <= 18.50) {
            System.out.println("su peso es es bajo");
        } else if (imc <= 24.99) {
            System.out.println("su pero es normal");
        } else if (imc <= 29.99) {
            System.out.println("tiene sobrepeso");
        } else if (imc <= 34.99) {
            System.out.println("tiene obesidad leve");
        } else if (imc <= 39.99) {
            System.out.println("tiene obesidad media");
        } else if (imc >= 40.00) {
            System.out.println("tiene obesidad morbida");
        }
        return imc;
    }
    public static double masaMagra(double peso, double altura,char sexo){

    }
}
