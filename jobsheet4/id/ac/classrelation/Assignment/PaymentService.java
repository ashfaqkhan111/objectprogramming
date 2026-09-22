package jobsheet4.id.ac.classrelation.Assignment;

public class PaymentService {

    public boolean makePayment(double amount) {

        System.out.println("Processing payment...");
        System.out.println("Payment amount: Rp" + amount);
        System.out.println("Payment successful.");

        return true;
    }
}
