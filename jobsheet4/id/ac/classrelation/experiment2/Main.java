package jobsheet4.id.ac.classrelation.experiment2;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("BMW");
        c.setCost(10000);

        Driver d = new Driver();
        d.setName("jhon");
        d.setCost(18000);

        Customer cm = new Customer();
        cm.setName("khan");
        cm.setCar(c);
        cm.setDriver(d);
        cm.setDays(4);

        System.out.println("total Cost : "+ cm.calculateTotalCost());
        System.out.println("C Name : "+cm.getName());
        System.out.println("D name : "+d.getName());
        System.out.println("Car brand : " + c.getBrand());
    }
    
}
