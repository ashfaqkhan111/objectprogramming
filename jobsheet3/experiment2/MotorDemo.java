package jobsheet3.experiment2;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();

        motor.printStatus();
        motor.increaseSpeed();

        motor.turnON();
        motor.printStatus();

        motor.increaseSpeed();
        motor.printStatus();

        motor.increaseSpeed();
        motor.printStatus();

        motor.decreaseSpeed();
        motor.printStatus();
        motor.decreaseSpeed();

        motor.turnOff();
        motor.printStatus();
    }
    
}
