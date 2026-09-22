package jobsheet4.id.ac.classrelation.experiment4;

public class Seat {
    private String number;
    private Passenger passenger;

    public Seat (String number){
        this.number = number;

    }
    public void setPessenger(Passenger passenger){
        this.passenger = passenger;
    }
    public Passenger getPassenger(){
        return passenger;
    }

    public String info(){
        String info ="";

        info += "NUmber : " + this.number +"\n";
        
        if(this.passenger != null){
            info += "passenger : " + this.passenger.info() +"\n";
        }
        return info;
    }
    
}
