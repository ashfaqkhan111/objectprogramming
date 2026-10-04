package jobsheet5.Assignment;

public class FlightTicket extends Ticket {

   protected  String airline;
   protected int baggageWeight;

   public FlightTicket(){

   }

   public FlightTicket(String ticketCode, String passengerName, String origin, String destination, int basePrice, String airline, int baggageWeight){
                        super(ticketCode, passengerName, origin, destination, basePrice);
                        this.airline = airline;
                        this.baggageWeight = baggageWeight;
   }

   public int calulateBaggageFee (int baggageWeight){
        int extraBaggageFee = 0;

        if (baggageWeight < 20){
            return 0; 
        }
         extraBaggageFee = (baggageWeight-20)*50000;

         return extraBaggageFee;

   }

   public void displayFlightTicketData(){
    super.displayTicket();
    System.out.println("Airline : "+airline);
    System.out.println("baggage weignt : "+baggageWeight);

    System.out.println("Baggage fee : "+calulateBaggageFee(baggageWeight));
   }
    
}
