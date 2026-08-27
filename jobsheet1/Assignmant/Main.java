package objectprogramming.jobsheet1.Assignmant;


public class Main {
    public static void main(String[] args) {
        
        SmartPhone smartphone = new SmartPhone();
        smartphone.brand = "Samsung";
        smartphone.storage = 256;

       TV television = new TV();
        television.brand = "LG";
        television.screenSize = 55;

        SportsCar sportsCar = new SportsCar();
        sportsCar.brand = "Ferrari";
        sportsCar.color = "Red";
        sportsCar.topSpeed = 340;
        sportsCar.hasSpoiler = true;

        Truck truck = new Truck();
        truck.brand = "Volvo";
        truck.color = "Blue";
        truck.loadCapacity = 10000;
        truck.numberOfWheels = 6;

        System.out.println("=== SMARTPHONE ===");
        smartphone.showInfo();
        smartphone.makeCall();
        smartphone.takePhoto();

        System.out.println("\n=== TELEVISION ===");
        television.showInfo();
        television.turnOn();
        television.changeChannel();

        System.out.println("\n=== SPORTS CAR ===");
        sportsCar.showInfo();
        sportsCar.startEngine();
        sportsCar.driveFast();
        sportsCar.useSpoiler();

        System.out.println("\n=== TRUCK ===");
        truck.showInfo();
        truck.startEngine();
        truck.carryLoad();
        truck.unload();
    }
}
