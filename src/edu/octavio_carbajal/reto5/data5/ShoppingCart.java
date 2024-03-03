package edu.octavio_carbajal.reto5.data5;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(CartItem item) {
        items.remove(item);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (CartItem item : items) {
            total += item.calculateSubtotal();
        }
        return total;
    }
}
