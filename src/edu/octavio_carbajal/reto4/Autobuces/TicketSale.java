package edu.octavio_carbajal.reto4.Autobuces;

import java.util.ArrayList;

public class TicketSale {
    private String buyerName;
    private int quantity;
    private ArrayList<String> additionalPassengers;

    public TicketSale(String buyerName, int quantity, ArrayList<String> additionalPassengers) {
        this.buyerName = buyerName;
        this.quantity = quantity;
        this.additionalPassengers = additionalPassengers;
    }

    public double getTotalPrice() {
        return quantity * TicketManager.getTicketPrice();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public int getQuantity() {
        return quantity;
    }

    public ArrayList<String> getAdditionalPassengers() {
        return additionalPassengers;
    }
}
