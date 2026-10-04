package jobsheet5.experiment5;

public class Main {
 
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "vivan";
        m.address = "malang";
        m.age = 30;
        m.gender = "male";
        m.salary = 200000000;
        m.allowence = 10000000;
        m.displayManagerData();

        Staff s = new Staff();
        s.name = "khan";
        s.address = "jawa timur";
        s.age = 22;
        s.gender = "male";
        s.salary = 15000000;
        s.overTime = 500000;
        s.deduction = 30000;
        s.displayEmployeeData();
    }
    
}
