package jobsheet4.id.ac.classrelation.experiment4;

public class Passenger {
    private String idCard;
    private String name;

    public Passenger(String idCard, String name){
        this.idCard = idCard;
        this.name = name;
    }
    
    public void setID (String idCard){
        this.idCard = idCard;
    }
    public String getID(){
        return idCard;
    }

    public void setName(String name){
        this.name = name;
    }
    public  String getName (){
        return name;
    }

    public String info(){
        String info = "";

        info += "ID Card : "+ this.idCard+ "\n";
        info += "Name : "+ this.name + "\n";

        return info;
    }
}
