package jobsheet5.experiment5;

public class Manager extends  Employee{
    public int allowence;

    public Manager(){

    }
    public void displayManagerData(){
        super.displayEmployeeData();
        System.out.println("allowence : "+allowence);
    }
    
}
