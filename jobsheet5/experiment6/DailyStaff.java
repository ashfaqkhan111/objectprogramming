package jobsheet5.experiment6;

public class DailyStaff extends Staff {

    public int numberOfHours;

    public DailyStaff (String name, String address, int age, String gender, int salary, int overTime, int deduction, int numberOfHours){
            super(name,address,age,gender,salary,overTime,deduction);
            this.numberOfHours = numberOfHours;
    }

    public void displayDailyStaffData(){
        super.displayEmployeeData();
        System.out.println("number of hours : "+numberOfHours);
    }
    
}
