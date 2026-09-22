package jobsheet4.id.ac.classrelation.experiment4;

public class Main {
    public static void main(String[] args) {
        Passenger p = new Passenger("2345",  "Mr.khan");
        Carriage c = new Carriage("A", 10);
        c.setPassenger(p,1);

        System.out.println(c.info());

    }
    
}
