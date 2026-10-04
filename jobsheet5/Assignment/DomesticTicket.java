package jobsheet5.Assignment;

public class DomesticTicket extends FlightTicket{

    protected int airPortTax;

    public DomesticTicket(){

    }

    public  DomesticTicket(String airline, int baggageWeight, int airPortTax){
                            super();
                            this.airPortTax = airPortTax;
    }

    public void displayDomesticFlightData(){

        System.out.println("=========Domestic flight data =========");
        super.displayFlightTicketData();
        System.out.println("Rute : "+ origin +" - "+ destination);

        System.out.println("airport tax : "+ airPortTax);

        
    }
    
}
