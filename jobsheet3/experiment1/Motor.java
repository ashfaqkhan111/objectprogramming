package jobsheet3.experiment1;

public class Motor {
    public int speed = 0;
    public boolean ignition = false;

    public void printStatus(){
        if (ignition == true){
            System.out.println("Ignition is on!");

        }else{
            System.out.println("ignition is off");
        }
        System.out.println("Speed "+speed+"\n");
    }

}
