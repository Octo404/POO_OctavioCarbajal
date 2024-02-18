package edu.octavio_carbajal.reto4.ui;

import edu.octavio_carbajal.reto4.Autobuces.TicketManager;
import edu.octavio_carbajal.reto4.Autobuces.TicketSale;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("A. Realizar venta de boleto");
            System.out.println("B. Mostrar datos de la lista de ventas");
            System.out.println("S. Finalizar programa");
            System.out.print("Seleccione una opción: ");
            String option = scanner.nextLine().toUpperCase();

            switch (option) {
                case "A":
                    sellTicket(scanner);
                    break;
                case "B":
                    showSalesData();
                    break;
                case "S":
                    System.out.println("Programa finalizado.");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

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

        TicketManager.sellTicket(buyerName, quantity, additionalPassengers);
        System.out.println("Ticket de venta generado.");
    }

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

        System.out.println("Importe total de la lista de boletos: $" + TicketManager.calculateTotalIncome());
        System.out.println("Cantidad total de pasajeros registrados: " + TicketManager.getTotalPassengers());
    }
}

