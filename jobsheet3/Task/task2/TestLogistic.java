package jobsheet3.Task.task2;

public class TestLogistic {
    public static void main(String[] args) {

        Container containerAlfa =
                new Container("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Container Owner Name: "
                + containerAlfa.getOwnerName());

        System.out.println("Maximum Capacity: "
                + containerAlfa.getMaximumCapacity() + " kg");

        System.out.println("\nAdding new cargo weighing 6,000 kg...");
        containerAlfa.addCargo(6000);

        System.out.println("Current cargo weight: "
                + containerAlfa.getCurrentCargoWeight() + " kg");

        System.out.println("\nAdding new cargo weighing 4,000 kg...");
        containerAlfa.addCargo(4000);

        System.out.println("Current cargo weight: "
                + containerAlfa.getCurrentCargoWeight() + " kg");

        System.out.println("\nUnloading cargo weighing 500 kg...");
        containerAlfa.unloadCargo(500);

        System.out.println("Current cargo weight: "
                + containerAlfa.getCurrentCargoWeight() + " kg");

        System.out.println("\nUnloading cargo weighing 1,500 kg...");
        containerAlfa.unloadCargo(1500);

        System.out.println("Current cargo weight: "
                + containerAlfa.getCurrentCargoWeight() + " kg");
    }
}
