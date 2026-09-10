package jobsheet3.experiment1;

public class Motor {
<<<<<<< HEAD
    public int speed = 0;
    public boolean ignition = false;
=======
    // public int speed = 0;
    // public boolean ignition = false;

    // public void printStatus(){
    //     if (ignition == true){
    //         System.out.println("Ignition is on!");

    //     }else{
    //         System.out.println("ignition is off");
    //     }
    //     System.out.println("Speed "+speed+"\n");
    // }

    private int speed = 0;
    private  boolean ignition = false;

    public void setSpeed(int speed){

        this.speed = speed;

    }

    public void setIgnition(boolean ignition){

        this.ignition = ignition;

    }
>>>>>>> def2d53 (update)

    public void printStatus(){
        if (ignition == true){
            System.out.println("Ignition is on!");
<<<<<<< HEAD

        }else{
=======
        }
        else{
>>>>>>> def2d53 (update)
            System.out.println("ignition is off");
        }
        System.out.println("Speed "+speed+"\n");
    }

}
