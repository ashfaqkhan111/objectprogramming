package jobsheet9.assignment;

public class Lion extends Animal implements Carnivore{

    private String sound;
    private String color;

    public Lion(String name, int noOfLegs, String sound, String color){
        super(name,noOfLegs);
        this.sound = sound;
        this.color = color;
    }

    @Override 
    public void displayFood(){
        System.out.println("Food : Meat");
    }

    @Override 
    public void displayAnimal(){
        super.displayAnimal();
    }

    public void displayData(){
        System.out.println("Type : Carnivore ");
        displayFood();
        System.out.println("Name : "+getName());
        System.out.println("NO of legs : "+getNoOfLegs());
        System.out.println("Sound : "+sound);
        System.out.println("Color  : "+color);
    }
    
}
