package jobsheet4.id.ac.classrelation.Assignment;

public class Main {

    public static void main(String[] args) {

        
        Product laptop = new Product(
                1,
                "Laptop",
                10000000
        );

        Product mouse = new Product(
                2,
                "Wireless Mouse",
                250000
        );

        Product keyboard = new Product(
                3,
                "Mechanical Keyboard",
                750000
        );

       
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);

        cart.showProducts();

        System.out.println();
        System.out.println("Cart Total: Rp" + cart.getTotal());

        System.out.println();
        System.out.println("====================");

     
        Order order = new Order(1001);

        order.addItem(laptop, 1);
        order.addItem(mouse, 2);
        order.addItem(keyboard, 1);

        order.showOrder();

        System.out.println();
        System.out.println("====================");

      
        PaymentService paymentService = new PaymentService();

        CheckoutService checkoutService = new CheckoutService();

        checkoutService.checkout(
                order,
                paymentService
        );
    }
}
