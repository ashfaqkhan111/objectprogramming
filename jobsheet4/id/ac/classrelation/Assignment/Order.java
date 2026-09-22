package jobsheet4.id.ac.classrelation.Assignment;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private List<OrderItem> items;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {

        OrderItem item = new OrderItem(product, quantity);

        items.add(item);
    }

    public double getTotal() {

        double total = 0;

        for (OrderItem item : items) {
            total += item.getSubtotal();
        }

        return total;
    }

    public void showOrder() {

        System.out.println("Order ID: " + orderId);
        System.out.println("Order Items:");

        for (OrderItem item : items) {
            System.out.println(item);
        }

        System.out.println("Total: Rp" + getTotal());
    }
}
