package jobsheet4.id.ac.classrelation.experiment3;

public class Train {
    private String name;
    private String trainClass;

    private Employee trainDriver;
    private Employee assistent;

    public Train (String name, String trainClass, Employee trainDriver){
        this.name = name;
        this.trainClass = trainClass;
        this.trainDriver = trainDriver;
    }

    public Train (String name, String trainClass, Employee trainDriver, Employee assistent){
        this.name = name;
        this.trainClass = trainClass;
        this.trainDriver = trainDriver;
        this.assistent = assistent;
    }
    
    public void setTrainDriver(Employee trainDriver){
        this.trainDriver = trainDriver;
    }
    public Employee getTrainDriver(){
        return trainDriver;
    }

    public void setAssistent (Employee assistent){
        this.assistent = assistent;
    }
    public Employee getAssistent(){
        return assistent;
    }

    public String info (){
        String info = "";

        info += "Name : " + this.name + "\n" ;
        info += "class : "+ this.trainClass + "\n";
        info += "Train Driver : "+ this.trainDriver.info() + "\n";
        
        if (this.assistent != null){
            info += "Assistent : "+this.assistent.info() + "\n";
        }

        return  info;

    }
}
