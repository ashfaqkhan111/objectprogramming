package jobsheet5.Assignment;

public class Ticket {
  protected  String ticketCode;  
  protected  String pessangerName;
  protected  String origin;
  protected String destination;
  protected int basePrice;

  public Ticket(){

  }

  public Ticket(String ticketCode, String pessangerName, String origin, String destination, int basePrice){
                this.ticketCode = ticketCode;
                this.pessangerName = pessangerName;
                this.origin = origin;
                this.destination = destination;
                this.basePrice = basePrice;
  }

  public void displayTicket(){
        System.out.println("ticket code : "+ticketCode);
        System.out.println("pessanger name : "+pessangerName);
        System.out.println("origin : "+origin);
        System.out.println("destination : "+destination);
        System.out.println("base price : "+basePrice);
  }

    
}
