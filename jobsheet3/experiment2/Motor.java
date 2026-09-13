package jobsheet3.experiment2;

public class Motor {
    private int speed = 0;
    private  boolean ignition = false;

    public void turnON (){
      ignition=true;
      System.out.println("Engine on");
    }
    public void turnOff (){
        ignition=false;
        System.out.println("Engine is off");
       
    }

    public void increaseSpeed(){
        if(ignition == true){
            speed +=5;
            System.out.println("speed +5");
        }else{
            System.out.println("speed does not increase iginition is off!");
        }
        
    }
    public void decreaseSpeed(){
        if(ignition==true){
            speed -=5;
            System.out.println("speed -5");
        }else {
            System.out.println("ignition is off!");
        }
    }
    public void printStatus(){
        if(ignition==true){
            System.out.println("ignition is on");
        }else{
            System.out.println("ignition off!");
        }
        System.out.println("speed "+speed+"\n"  );
    }


}
