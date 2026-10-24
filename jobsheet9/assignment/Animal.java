package jobsheet9.assignment;

public abstract class Animal {

    protected String name;
    protected int noOfLegs;

    public Animal(String name, int noOfLegs){
        this.name = name;
        this.noOfLegs = noOfLegs;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setNoOfLegs(int noOfLegs){
        this.noOfLegs = noOfLegs;

    }
    public int getNoOfLegs(){
        return noOfLegs;
    }

    public void displayAnimal(){
        System.out.println("Animal Name : "+name);
        System.out.println("Number of legs : "+noOfLegs);
    }
    
}
