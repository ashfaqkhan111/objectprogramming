package jobsheet4.id.ac.classrelation.experiment3;

public class Mian {
    public static void main(String[] args) {
        Employee trainDriver = new Employee("1234", "Sponebob");
        Employee assistent = new Employee("457", "Patrik");

        Train train = new Train ("Gaya Baru","Business",trainDriver,assistent);

        System.out.println(train.info());
    }
}
