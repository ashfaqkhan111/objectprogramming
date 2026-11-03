package jobsheet12.exp1;

public class Main {

    public static void main(String[] args) {
        PermanentEmployee pE = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iE = new InternshipEmployee("sunarto", 5);
        ElectrictyBill eB = new ElectrictyBill(5, "R-1");

        Employee e;
        Payable p;

        e = pE;
        e = iE;
        p = pE;
        p = eB;

        
        System.out.println(e.getEmployeeInfo());
        System.out.println("-------------------------");

        System.out.println(e.getEmployeeInfo());
        System.out.println("--------------------------");

        System.out.println(p.getPaymentAmount());
        System.out.println("----------------------------");

        System.out.println("Electricty payment : "+p.getPaymentAmount());
        System.out.println("-----------------------------");

        System.out.println(eB.getBillInfo());
    }
    
}
