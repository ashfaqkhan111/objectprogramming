package jobsheet5.experiment6;

public class PermanentStaff extends Staff {

     public String grade;
     public int insurance;

     public PermanentStaff(String name, String address, int age, String gender, int salary, int overTime, int deduction, String grade, int insurance){
                            super(name,address,age,gender,salary,overTime,deduction);
                            this.grade = grade;
                            this.insurance = insurance;
     }

     public void displayPermanentStaffData(){
        super.displayEmployeeData();
        System.out.println("grade : "+grade);
        System.out.println("insurance : "+insurance);
     }
    
}
