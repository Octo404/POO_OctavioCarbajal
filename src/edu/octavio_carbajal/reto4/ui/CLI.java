package edu.octavio_carbajal.reto4.ui;

import edu.octavio_carbajal.reto4.Autobuces.TicketManager;
import edu.octavio_carbajal.reto4.Autobuces.TicketSale;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar opciones del menú
            System.out.println("Menu:");
            System.out.println("A. Realizar venta de boleto");
            System.out.println("B. Mostrar datos de la lista de ventas");
            System.out.println("S. Finalizar programa");
            System.out.print("Seleccione una opción: ");
            String option = scanner.nextLine().toUpperCase();

            switch (option) {
                case "A":
                    sellTicket(scanner); // Realizar venta de boleto
                    break;
                case "B":
                    showSalesData(); // Mostrar datos de la lista de ventas
                    break;
                case "S":
                    System.out.println("Programa finalizado.");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    // Método para realizar la venta de boletos
    private static void sellTicket(Scanner scanner) {
        System.out.print("Ingrese nombre completo del comprador: ");
        String buyerName = scanner.nextLine();

        System.out.print("Ingrese cantidad de boletos: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        ArrayList<String> additionalPassengers = new ArrayList<>();
        for (int i = 0; i < quantity - 1; i++) {
            System.out.print("Ingrese nombre completo del pasajero adicional " + (i + 1) + ": ");
            additionalPassengers.add(scanner.nextLine());
        }

        // Registrar la venta de boletos
        TicketManager.sellTicket(buyerName, quantity, additionalPassengers);
        System.out.println("Ticket de venta generado.");
    }

    // Método para mostrar los datos de la lista de ventas de boletos
    private static void showSalesData() {
        System.out.println("Lista de pasajeros registrados:");
        ArrayList<TicketSale> ticketSales;
        ticketSales = TicketManager.getTicketSales();
        ticketSales.forEach(sale -> {
            System.out.println("Comprador: " + sale.getBuyerName());
            System.out.println("Cantidad de boletos: " + sale.getBuyerName());
            System.out.println("Pasajeros adicionales:");
            for (String passenger : sale.getAdditionalPassengers()) {
                System.out.println("- " + passenger);
            }
            System.out.println("Precio total: $" + sale.getTotalPrice());
            System.out.println();
        });

        // Mostrar el ingreso total y la cantidad total de pasajeros registrados
        System.out.println("Importe total de la lista de boletos: $" + TicketManager.calculateTotalIncome());
        System.out.println("Cantidad total de pasajeros registrados: " + TicketManager.getTotalPassengers());
    }
}

