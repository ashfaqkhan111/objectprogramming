package jobsheet4.id.ac.classrelation.experiment4;

public class Carriage {

    private String code;
    private Seat[] seatArry;

    public Carriage(String code, int count){
        this.code = code;
        this.seatArry = new Seat[count];
        this.initSeats();
    }

    private void initSeats() {
        for (int i=0; i< seatArry.length; i++){
            this.seatArry[i] = new Seat(String.valueOf(i + 1));
        }
    }

    public void setPassenger (Passenger passenger, int number){
        this.seatArry[number -1 ].setPessenger(passenger);
    }

    public String info(){
        String info = "";

        info += "Code : "+ code +"\n";

        for (Seat seat : seatArry){
            info += seat.info();
        }

        return info;
    }
    
}
