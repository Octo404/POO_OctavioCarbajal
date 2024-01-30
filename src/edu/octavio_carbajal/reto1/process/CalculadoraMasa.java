package edu.octavio_carbajal.reto1.process;

public class CalculadoraMasa {
    /**
     * Esta clase sirve para guardar los calculos de la calculadora
     * @param altura es la altura que se le pide al usuario en centimetros
     * @param peso es el peso que se le pide al usuario en kilogramos
     * @return sirve para terminar el la calse y regresar al inicion **/
    public static double calcularMasaCorporal(double peso, double altura){
        /**
         * en este apartado especificamos al usuario su IMC y
         * el tipo de peso u obesidad que tiene
         * utilizamos tambien Math.pow para realizar parte
         * de las operacion y usar exoponentes**/
        double metros = altura/100;
        double imc = peso/Math.pow(metros,2);
        if (imc <= 18.50) {
            System.out.println("su peso es es bajo");
        } else if (imc <= 24.99) {
            System.out.println("su peso es normal");
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
    }/**
     *Esta clase se encarga de realizar las operaciones de Masa Magra
     * @param peso pidel el peso en kilogramos
     * @param altura pide la altura en centimetros
     * @param sexo le pide al usuario que escoja su sexo ya sea Masculino o Femenino
     * @return sirve para terminar el la calse y regresar al inicion
     **/
    public static double masaMagra(double peso, double altura,char sexo){
        /**
         * Aqui utilizamos nuevamente Math.pow para sacar exponentes
         * para sacar el rezultado
         * utilizamos if else para separar el resultado entre ambos sexos
         */
        double masaMagra = 0;
        if (sexo == 'M' || sexo == 'm' ) {
            masaMagra=(peso*1.10 ) - 128 * (Math.pow(peso,2))/Math.pow(altura,2);
        }else if (sexo == 'F' || sexo == 'f'){
            masaMagra=(peso*1.07) - 148 * (Math.pow(peso,2))/Math.pow(altura,2);
        }

        return masaMagra;
    }

    /**
     * Esta clase se encarga de sacar los calculos y resultados para el Metabolismo Basal
     * @param peso pide el peso en kilogramos
     * @param altura pide la altura en centimetros
     * @param edad pide la edad del usuario en un valor entero
     * @param sexo le pide al usuario que escoja su sexo ya sea Masculino o Femenino
     * @return sirve para terminar el la calse y regresar al inicion
     */
    public static double metabolismoBasal(double peso, double altura, int edad,char sexo){
        /**
         * En esta parte ya no usamos Math.pow al ser operaciones mas sencillas
         * y al igual que antes se utiliza if else para separar los resultados entre masculino y femenino
         */
        double metabolismoBasal = 0;
        if (sexo == 'M' || sexo == 'm') {
            metabolismoBasal= 66.5+(13.75*peso) + (5.003*altura) - (6.775*edad);
        } else if (sexo == 'F' || sexo == 'f') {
            metabolismoBasal= 655.1 + (9.563*peso) + (1.85*altura) - (4.676*edad);
        }
        return metabolismoBasal;
    }
}
