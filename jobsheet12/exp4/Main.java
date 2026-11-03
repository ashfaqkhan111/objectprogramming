package jobsheet12.exp4;

public class Main {

    public static void main(String[] args) {
        Owner ow = new Owner();

        ElectrictyBill eb = new ElectrictyBill(10, "R-1");
        ow.pay(eb);
        System.out.println("----------------------------------------");

        PermanentEmployee pE = new PermanentEmployee("sunarto", 500);
        ow.pay(pE);
        System.out.println("-----------------------------------------");

        InternshipEmployee iE = new InternshipEmployee("Dedik", 5);
        ow.pay(pE);
        System.out.println("------------------------------------------");
        // ow.showMyEmployee(iE);
    }
    
}
