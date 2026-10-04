package jobsheet5.experiment2;

public class Main {
    public static void main(String[] args) {
        ClassB calculator = new ClassB();

        calculator.setX(20);
        calculator.setY(30);
        calculator.setZ(5);

        calculator.getResult();
        calculator.getResultZ();
        calculator.getTotal();
    }
    
}
