package jobsheet5.Assignment;

public class TrainTicket extends Ticket{
  protected  int coachNumber;
  protected  String seatNumber;

  public TrainTicket (){

  }
  
  public  TrainTicket(String ticketCode, String passengerName, String origin, String destination, int basePrice, int coachNumber, String seatNumber){
                     super(ticketCode,passengerName,origin,destination,basePrice);
                    // super();
                     this.coachNumber = coachNumber;
                     this.seatNumber = seatNumber;
  }

  public void displayTrainTicketData(){
    System.out.println("=========Train ticcket ========");
    super.displayTicket();

    System.out.println(" Rute : "+origin+" - "+destination);
    System.out.println("Coach Number : "+coachNumber);
    System.out.println("seat number : "+ seatNumber);
    

  };

}
