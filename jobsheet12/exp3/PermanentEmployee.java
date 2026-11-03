package jobsheet12.exp3;

public class PermanentEmployee extends Employee implements Payable {
    private int salary;

    public PermanentEmployee(String name, int salary){
        super();

        this.name = name;
        this.salary = salary;

    }

    public int getAmount(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override 
    public int getPaymentAmount(){
        return (int) (salary + 0.05*salary);
    }

    @Override 
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Employee registerd as permanent employee with salary "+salary;
        return info;
    }
}
