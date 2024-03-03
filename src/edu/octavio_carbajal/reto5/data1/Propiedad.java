package edu.octavio_carbajal.reto5.data1;

public class Propiedad {
    private int id;
    private String direccion;
    private double precio;
    private double area;
    private String tipo;
    private String estatus;

    public Propiedad(int id, String direccion, double price, double area, String tipo, String estatus) {
        this.id = id;
        this.direccion= direccion;
        this.precio = price;
        this.area = area;
        this.tipo = tipo;
        this.estatus = estatus;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return direccion;
    }

    public double getPrice() {
        return precio;
    }

    public double getArea() {
        return area;
    }

    public String getType() {
        return tipo;
    }

    public String getStatus() {
        return estatus;
    }
}
