package jobsheet5.experiment6;

public class Main {

    public static void main(String[] args) {

        System.out.println("====Permanent staff data====");
        PermanentStaff ps = new PermanentStaff("kahn", "malang", 22, "male", 3000000, 1000000, 20000, "2A", 1000000);
            ps.displayPermanentStaffData();

        System.out.println("=====Daily staff data=====");
        DailyStaff ds = new DailyStaff("rayyan", "jawa timur", 20, "male", 30000000, 10000000, 50000, 16);
            ds.displayDailyStaffData();
    }
    
}
