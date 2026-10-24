package jobsheet9.exp1;

public class Person {
    private String name;
    private  Animal pet;

  public Person(String name){
    this.name = name;

  }

  public void keepPet(Animal pet){
    this.pet = pet;
  }

  public void takeForWalk(){
    System.out.println("My name is "+this.name);
    System.out.println("My Pet move by ");
    this.pet.move();
    System.out.println("-----------------------------");
  }


    
}
