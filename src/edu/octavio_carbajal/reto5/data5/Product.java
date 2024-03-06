package edu.octavio_carbajal.reto5.data5;

public class Product {
    private int id;
    private String name;
    private double price;
    private double taxRate;

    public Product(int id, String name, double price, double taxRate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.taxRate = taxRate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
