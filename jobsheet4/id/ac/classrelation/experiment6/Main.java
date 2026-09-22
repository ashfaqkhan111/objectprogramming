package jobsheet4.id.ac.classrelation.experiment6;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Thinkpad");
        Printer printer = new Printer("Epson L3110");

        laptop.printDocument(printer, "Report.pdf");
    }
}
