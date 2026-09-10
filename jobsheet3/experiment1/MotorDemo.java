package jobsheet3.experiment1;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();

        motor.printStatus();
<<<<<<< HEAD
        motor.ignition=true;
        motor.speed= 50;
=======
        // motor.ignition=true;
        // motor.speed= 50;
        
        motor.setSpeed(50);
        motor.setIgnition(true);
>>>>>>> def2d53 (update)
        motor.printStatus();
    }
}
