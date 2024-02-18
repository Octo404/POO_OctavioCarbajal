package edu.octavio_carbajal.reto4.Autobuces;

import java.util.ArrayList;

public class TicketSale {
    // Datos de la venta de boletos
    private String buyerName; // Nombre del comprador
    private int quantity; // Cantidad de boletos
    private ArrayList<String> additionalPassengers; // Lista de pasajeros adicionales

    public TicketSale(String buyerName, int quantity, ArrayList<String> additionalPassengers) {
        this.buyerName = buyerName;
        this.quantity = quantity;
        this.additionalPassengers = additionalPassengers;
    }

    // Método para calcular el precio total de la venta de boletos
    public double getTotalPrice() {
        return quantity * TicketManager.getTicketPrice();
    }

    // Métodos getter para obtener los datos de la venta de boletos
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
