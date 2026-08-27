package objectprogramming.jobsheet1.Assignmant;

public class SmartPhone {
    String brand;
    int storage;

    void makeCall(){
        System.out.println("the smart phone id making call");

    }
    void takePhoto () {
        System.out.println("the smart phone is taking photo");

    }
    void showInfo (){
        System.out.println("Brand : "+brand);
        System.out.println("Storage : "+ storage + " GB");
    }
}
