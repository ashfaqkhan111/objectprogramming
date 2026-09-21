package jobsheet4.id.ac.classrelation.experimant1;

public class Main {
    public static void main(String[] args) {
        // Processor p = new Processor("intel i5", 3);
        // Laptop l = new Laptop("thinkpad",p);
        // l.info();



        // Processor p = new Processor();
        // Laptop l = new Laptop();

        // p.setBrand("intel i5");
        // p.setCache(4);

        // l.setBrand("thinkpad");
        // l.setProc(p);

        // l.info();

        Laptop l = new Laptop("thinkpad", new Processor("intel i5", 3));
        l.info();
    }
}
