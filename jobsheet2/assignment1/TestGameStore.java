package objectprogramming.jobsheet2.assignment1;

public class TestGameStore {

    public static void main(String[] args) {
        GameStore gs1 = new GameStore();
        gs1.id = 001;
        gs1.gameName = "Red Dead";
        gs1.memberName = "khan";
        gs1.pricePerDay = 10000;
        gs1.rentalDuration = 3;

        gs1.displayData();
    }
    
}
