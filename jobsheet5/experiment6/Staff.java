package jobsheet5.experiment6;

public class Staff extends Employee {

    public  int overTime;
    public int deduction;

    public Staff(String name, String address, int age, String gender, int salary, int overTime, int deduction){
                super(name,address,age,gender,salary);

                this.overTime = overTime;
                this.deduction = deduction;
    }

    public void displayStafData(){
        super.displayEmployeeData();

        System.out.println("over time : "+overTime);
        System.out.println("deduction : "+deduction);
        System.out.println("total salary : "+ (salary + overTime - deduction));
    }

    
    
}
