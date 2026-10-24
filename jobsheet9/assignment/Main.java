package jobsheet9.assignment;

public class Main {

    public static void main(String[] args) {
        
        Lion lion = new Lion("ChingaCing", 4, "Roarrrrrr", "Brown");

        Donkey donkey = new Donkey("Donkey", 4, "hehehehe", "Grey");

        Gorilla gorilla = new Gorilla("Gulali", 4, "Huaaaam", "Black");

        donkey.displayData();
        System.out.println("--------------------");
        gorilla.displayData();
        System.out.println("--------------------");
        lion.displayData();
    }
    
}
