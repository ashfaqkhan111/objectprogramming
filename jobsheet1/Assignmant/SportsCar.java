package objectprogramming.jobsheet1.Assignmant;

class SportsCar extends Vehicle {
        int topSpeed;
        boolean hasSpoiler;

        void driveFast() {
            System.out.println("sport car is fast");

        }
        void useSpoiler(){
            System.out.println("spoiler is being used");
        }

        void showInfo(){
            System.out.println("Sports car Brand : "+brand);
            System.out.println("Color : "+color);
            System.out.println("Has Spoiler " + hasSpoiler);
            System.out.println("Top speed " + topSpeed);
        }

        
    }