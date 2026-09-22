package jobsheet4.id.ac.classrelation.Assignment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void showProducts() {
        System.out.println("Shopping Cart:");

        for (Product product : products) {
            System.out.println(product);
        }
    }

    public double getTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }
}
