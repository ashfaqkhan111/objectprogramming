package jobsheet9.assignment;

public class Donkey extends Animal implements Herbivore{
    
        private String sound;
        private String color;

        public Donkey(String name, int noOfLegs, String sound, String color){
            super(name,noOfLegs);
            this.sound = sound;
            this.color = color;
        }

        @Override 
        public void displayFood(){
            System.out.println("Food : grass");
        }

        @Override 
        public void displayAnimal(){
            super.displayAnimal();
        }

        public void displayData(){
            System.out.println("Type : Herbiore");
            displayAnimal();
            System.out.println("Name : "+getName());
            System.out.println("NO of Legs : "+getNoOfLegs());
            System.out.println("Sound  : "+sound);
            System.out.println("Color : "+color);

        }
}
