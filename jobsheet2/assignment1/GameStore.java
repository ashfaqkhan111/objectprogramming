package objectprogramming.jobsheet2.assignment1;

public class GameStore {
    int id ;
    String memberName;
    String gameName;
    double payAmount;
    double pricePerDay;
    int rentalDuration;

    public double PayCalculation(){
        double totalPrice = pricePerDay * rentalDuration;

        return totalPrice;
    }

    public void displayData(){
        System.out.println("Game Id : "+id);
        System.out.println("Game name : "+gameName);
        System.out.println("Member name: "+ memberName);
        System.out.println("Total amount : "+PayCalculation());
    }
    
}
