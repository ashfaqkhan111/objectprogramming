package jobsheet5.experiment6;

public class Manager extends Employee {
    public int allowence;

    public Manager(){

    }

    public void displayManagerData(){
        super.displayEmployeeData();
        System.out.println("allowence : "+allowence);
    }
    
}
