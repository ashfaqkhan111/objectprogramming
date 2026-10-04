package jobsheet5.Assignment;

public class Main {
    public static void main(String[] args) {
        
        TrainTicket tt = new TrainTicket();
        tt.ticketCode = "KA-001";
        tt.pessangerName = "Andi";
        tt.origin = "malang";
        tt.destination = "jakarta";
        tt.coachNumber = 3;
        tt.seatNumber = "12A";
        tt.basePrice = 350000;

        
        tt.displayTrainTicketData();

        DomesticTicket dt = new DomesticTicket();
        dt.ticketCode = "GA-102";
        dt.pessangerName = "Andi";
        dt.airline = "Garuda";
        dt.basePrice = 900000000;
        dt.destination = "surabaya";
        dt.origin = "depensar";
        dt.baggageWeight = 26;
        
        dt.displayDomesticFlightData();

        InternationalTicket it = new InternationalTicket();
        it.ticketCode = "SQ-205";
        it.pessangerName = "Andi";
        it.basePrice = 2500000;
        it.baggageWeight = 20;
        it.passportNumber = "C1234567";
        it.insurance = 1500000;


        



    }
    
}
