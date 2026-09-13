package jobsheet3.Task.task2.task2Modified;

import java.util.Scanner;

public class TestLogistic {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Container containerAlfa =
                new Container("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Container Owner Name: "
                + containerAlfa.getOwnerName());

        System.out.println("Maximum Capacity: "
                + containerAlfa.getMaximumCapacity() + " kg");

        System.out.print("\nEnter cargo weight to add: ");
        double addWeight = input.nextDouble();

        containerAlfa.addCargo(addWeight);

        System.out.println("Current cargo weight: "
                + containerAlfa.getCurrentCargoWeight() + " kg");

        System.out.print("\nEnter cargo weight to add: ");
        addWeight = input.nextDouble();

        containerAlfa.addCargo(addWeight);

        System.out.println("Current cargo weight: "
                + containerAlfa.getCurrentCargoWeight() + " kg");

        System.out.print("\nEnter cargo weight to unload: ");
        double unloadWeight = input.nextDouble();

        containerAlfa.unloadCargo(unloadWeight);

        System.out.println("Current cargo weight: "
                + containerAlfa.getCurrentCargoWeight() + " kg");

        System.out.print("\nEnter cargo weight to unload: ");
        unloadWeight = input.nextDouble();

        containerAlfa.unloadCargo(unloadWeight);

        System.out.println("Current cargo weight: "
                + containerAlfa.getCurrentCargoWeight() + " kg");

        input.close();
}
}