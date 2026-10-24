package jobsheet9.exp1;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Fish fish = new Fish();

        Person person = new Person("Ani");
        Person person2 = new Person("Budi");

        person.keepPet(fish);
        person2.keepPet(cat);

        person2.takeForWalk();
        person.takeForWalk();
        
    
    }
}
