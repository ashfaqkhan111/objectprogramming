package jobsheet3.Task.task2;

public class Container {
    
    private String trackingNumber;
    private String ownerName;
    private double maximumCapacity;
    private double currentCargoWeight;

    public Container(String trackingNumber, String ownerName, double maximumCapacity) {
        this.trackingNumber = trackingNumber;
        this.ownerName = ownerName;
        this.maximumCapacity = maximumCapacity;
        this.currentCargoWeight = 0;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getMaximumCapacity() {
        return maximumCapacity;
    }

    public double getCurrentCargoWeight() {
        return currentCargoWeight;
    }

    public void addCargo(double weight) {
        if (currentCargoWeight + weight <= maximumCapacity) {
            currentCargoWeight += weight;
            System.out.println("Cargo added successfully.");
        } else {
            System.out.println("Cargo exceeds the maximum capacity.");
        }
    }

    public void unloadCargo(double weight) {
        if (weight <= currentCargoWeight) {
            currentCargoWeight -= weight;
            System.out.println("Cargo unloaded successfully.");
        } else {
            System.out.println("Current cargo weight is not enough.");
        }
    }
}
