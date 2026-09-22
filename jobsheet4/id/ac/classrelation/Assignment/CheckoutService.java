package jobsheet4.id.ac.classrelation.Assignment;

public class CheckoutService {

    public void checkout(Order order, PaymentService paymentService) {

        System.out.println("Starting checkout...");

        double total = order.getTotal();

        boolean paymentSuccessful =
                paymentService.makePayment(total);

        if (paymentSuccessful) {
            System.out.println("Checkout completed.");
        } else {
            System.out.println("Checkout failed.");
        }
    }
}
