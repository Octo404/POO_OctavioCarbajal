package edu.octavio_carbajal.reto4.Autobuces;

import java.util.ArrayList;

public class TicketManager {
    // Precio del boleto

    private static double ticketPrice = 1250.50;
    // Lista de ventas de boletos
    private static ArrayList<TicketSale> ticketSales = new ArrayList<>();

    public static void sellTicket(String buyerName, int quantity, ArrayList<String> additionalPassengers) {
        // Crea un objeto TicketSale con los datos proporcionados y lo agrega a la lista de ventas
        TicketSale sale = new TicketSale(buyerName, quantity, additionalPassengers);
        ticketSales.add(sale);
    }

    public static ArrayList<TicketSale> getTicketSales() {
        return ticketSales;
    }

    public static double calculateTotalIncome() {
        double totalIncome = 0;
        for (TicketSale sale : ticketSales) {
            totalIncome += sale.getTotalPrice();
        }
        return totalIncome;
    }

    public static int getTotalPassengers() {
        // Método para obtener la cantidad total de pasajeros registrados
        int totalPassengers = 0;
        for (TicketSale sale : ticketSales) {
            totalPassengers += sale.getQuantity() + sale.getAdditionalPassengers().size();
        }
        return totalPassengers;
    }

    // Método para obtener el precio del boleto
    public static double getTicketPrice() {
        return ticketPrice;
    }
}
