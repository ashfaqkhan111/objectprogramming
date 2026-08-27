package objectprogramming.jobsheet1.Assignmant;

    class Truck extends Vehicle{
        int loadCapacity;
        int numberOfWheels;

        void carryLoad(){
            System.out.println("truck is carrying load");

        }
        void unload(){
            System.out.println("the truck is unloading");
        }

        void showInfo(){
            System.out.println("Truck brand : "+brand);
            System.out.println("color : "+color);
            System.out.println("Load capisity : "+ loadCapacity);
            System.out.println("Number of wheels : "+ numberOfWheels);
        }
    }
