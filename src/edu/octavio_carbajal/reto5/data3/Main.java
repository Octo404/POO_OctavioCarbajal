package edu.octavio_carbajal.reto5.data3;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Leche", 2.5, 2);
        Producto producto2 = new Producto("Pan", 1.0, 3);
        Producto producto3 = new Producto("Huevos", 3.0, 1);

        ListaCompras listaCompras = new ListaCompras();
        listaCompras.agregarProducto(producto1);
        listaCompras.agregarProducto(producto2);
        listaCompras.agregarProducto(producto3);

        listaCompras.mostrarLista();
        double total = listaCompras.calcularTotal();
        System.out.println("Total a pagar: $" + total);
    }
}