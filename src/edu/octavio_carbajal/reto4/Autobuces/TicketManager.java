package edu.octavio_carbajal.reto4.Autobuces;

import java.util.ArrayList;

public class TicketManager {
    private static double ticketPrice = 1250.50;
    private static ArrayList<TicketSale> ticketSales = new ArrayList<>();

    public static void sellTicket(String buyerName, int quantity, ArrayList<String> additionalPassengers) {
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
        int totalPassengers = 0;
        for (TicketSale sale : ticketSales) {
            totalPassengers += sale.getQuantity() + sale.getAdditionalPassengers().size();
        }
        return totalPassengers;
    }

    public static double getTicketPrice() {
        return ticketPrice;
    }
}
