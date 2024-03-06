package edu.octavio_carbajal.reto5.data5;

public class Main {
    public static void main(String[] args) {
        // Crear algunos productos
        Product product1 = new Product(1, "Laptop", 1000.0, 0.16);
        Product product2 = new Product(2, "Smartphone", 500.0, 0.16);

        // Crear un carrito de compras
        ShoppingCart cart = new ShoppingCart();

        // Agregar algunos artículos al carrito
        cart.addItem(new CartItem(product1, 2));
        cart.addItem(new CartItem(product2, 1));

        // Calcular el total del carrito
        double total = cart.calculateTotal();
        System.out.println("Total de la compra: $" + total);
    }
}
