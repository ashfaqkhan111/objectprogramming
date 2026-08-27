package objectprogramming.jobsheet1.Assignmant;

public class TV {
    String brand;
    int screenSize;
    
    void turnOn (){
        System.out.println("the tv is on");
    }
    void changeChannel(){
        System.out.println("channal cahnged");
    }

    void showInfo(){
        System.out.println("Brand : "+brand);
        System.out.println("Screen Size : "+screenSize);
    }
}
