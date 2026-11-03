package jobsheet12.exp4;

public class InternshipEmployee extends Employee {
    private int length;

    public InternshipEmployee(String name, int length){
        super();
        this.name = name;
        this.length = length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }
    @Override 
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as internship employee.";
        return info;
        
    }
}
