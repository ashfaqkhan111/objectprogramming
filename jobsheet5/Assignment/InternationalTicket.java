package jobsheet5.Assignment;

public class InternationalTicket extends FlightTicket {

    protected String passportNumber;
    protected int insurance;

    public InternationalTicket (){

    }

    public  InternationalTicket(String airline, int baggageWeight, String passportNumber, int insurance){
                                super();
                                this.passportNumber = passportNumber;
                                this.insurance = insurance;
    }

    public void displayInternationalTicketData(){
        super.displayFlightTicketData();
        System.out.println("Rute : "+ origin +" - "+ destination);

        System.out.println("passport no : "+passportNumber);
        System.out.println("insuarance : "+insurance);

    }
    
}
