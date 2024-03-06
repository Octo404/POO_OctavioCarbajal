package edu.octavio_carbajal.reto5.data3;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public double obtenerImporte() {
        return precio * cantidad;
}
}