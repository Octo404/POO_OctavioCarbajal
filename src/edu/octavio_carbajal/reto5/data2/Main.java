package edu.octavio_carbajal.reto5.data2;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Crear clientes y cuentas
        Cliente customer1 = new Cliente(1, "John Doe");
        Cuenta account1 = new Cuenta("123456789", 1000);
        Cuenta account2 = new Cuenta("987654321", 500);
        customer1.addCuenta(account1);
        customer1.addCuenta(account2);

        Cliente customer2 = new Cliente(2, "Jane Smith");
        Cuenta account3 = new Cuenta("555555555", 2000);
        customer2.addCuenta(account3);

        // Agregar clientes al sistema del banco
        banco.addCliente(customer1);
        banco.addCliente(customer2);

        // Ejemplo de depósito y retiro
        account1.deposito(500);
        account2.retirar(200);

        // Imprimir el balance de las cuentas del primer cliente
        System.out.println("Cuentas de " + customer1.getNombre() + ":");
        for (Cuenta account : customer1.getCuentas()) {
            System.out.println("Número de cuenta: " + account.getNumeroCuenta());
            System.out.println("Saldo: $" + account.getSaldo());
        }
    }
}
