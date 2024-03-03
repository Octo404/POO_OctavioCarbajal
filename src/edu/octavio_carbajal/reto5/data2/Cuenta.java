package edu.octavio_carbajal.reto5.data2;

class Cuenta {
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String numeroCuenta, double balance) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = balance;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double amount) {
        saldo += amount;
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("dinero insuficiente");
        }
    }
}
