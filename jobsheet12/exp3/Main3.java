package jobsheet12.exp3;

public class Main3 {

    public static void main(String[] args) {
        PermanentEmployee pE = new PermanentEmployee("Dekid", 500);

        InternshipEmployee iE = new InternshipEmployee("Sunarto", 5);

        ElectrictyBill eB = new ElectrictyBill(5, "R-1");


        Employee e[] = {pE,iE};
        Payable p[] = {pE, eB};
        Employee e2[] = {pE, iE,eB};
    }
    
}
