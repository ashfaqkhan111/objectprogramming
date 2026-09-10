package jobsheet3.experiment1;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();

        motor.printStatus();
        motor.ignition=true;
        motor.speed= 50;
        motor.printStatus();
    }
}
