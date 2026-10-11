package jobsheet6;

public class Manager extends Employee{
    private double allowence;
    private String department;
    private Staff[] staff;

    public Manager(){
    }   
    
    public Manager (String name, String nip, String rank, double salary, double allowence, String department, int noOfStaff){
            super(name,nip,rank,salary);

            this.allowence = allowence;
            this.department = department;
            this.staff = new Staff[noOfStaff];
    }

    public void setAllowence(double allowence){
        this.allowence = allowence;
    }
    public double getAllowence(){
        return allowence;
    }

    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }

    public void setStaff(Staff[] staff){
        this.staff = staff;
    }

    public void viewStaff(){
        System.out.println("=========================");
        for(int i =0; i<staff.length; i++){
            staff[i].viewInfo();
        }
    }


    public void viewInfo(){
        System.out.println("name : "+super.getName());
        System.out.println("nip : "+super.getNip());
        System.out.println("rank : "+super.getRank());
        System.out.println("salary : "+getSalary());
        System.out.println("department : "+getDepartment());
        this.viewStaff();
    }
    public double getSalary(){
        return super.getSalary()+allowence;
    }


    
}
