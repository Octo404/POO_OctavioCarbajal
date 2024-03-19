package edu.octavio_carbajal.reto7.proces;

public class Calculadora {
    // Método para sumar dos números
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Método para restar dos números
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Método para multiplicar dos números sin utilizar el operador de multiplicación
    public double multiplicar(double num1, double num2) {
        double resultado = 0;
        for (int i = 0; i < Math.abs(num2); i++) {
            resultado += num1;
        }
        if (num2 < 0) {
            return -resultado;
        } else {
            return resultado;
        }
    }

    // Método para dividir dos números sin utilizar el operador de división
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        double resultado = 0;
        double absNum1 = Math.abs(num1);
        double absNum2 = Math.abs(num2);
        while (absNum1 >= absNum2) {
            absNum1 -= absNum2;
            resultado++;
        }
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            return -resultado;
        } else {
            return resultado;
        }
    }

    // Método para calcular el exponente de un número
    public double exponente(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Método para calcular el logaritmo de un número
    public double logaritmo(double num) {
        return Math.log(num);
    }

    // Método para calcular la raíz cuadrada de un número
    public double raizCuadrada(double num) {
        if (num < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(num);
    }
}
