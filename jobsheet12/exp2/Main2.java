package jobsheet12.exp2;

public class Main2 {

    public static void main(String[] args) {
        PermanentEmployee pE = new PermanentEmployee("Dedik", 500);

        Employee e; 

        e = pE;

        System.out.println(""+e.getEmployeeInfo());
        System.out.println("-------------------------");
        System.out.println(""+pE.getEmployeeInfo());
    }
    
}
