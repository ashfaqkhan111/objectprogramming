package jobsheet4.id.ac.classrelation.experimant1;

public class Processor {
    private String brand;
    private double cache;

    public Processor (){

    }

    public Processor (String brand, double cache){
        this.brand = brand;
        this.cache = cache;
    }

    public void setBrand (String brand){
        this.brand = brand;
    }

    public String getBrand (){
        return brand;
    }

    public void setCache (double cache){
        this.cache = cache;

    }

    public double getcache(){
        return cache;
    }

    public void info(){
        System.out.println("Processor Brand : "+ brand);
        System.out.println("Cache Memory : "+cache);
    }
}
