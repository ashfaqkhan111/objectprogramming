package jobsheet4.id.ac.classrelation.experiment3;

public class Employee {
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name ){
        this.employeeId = employeeId;
        this.name = name;

    }

    public void setEmployeeId (String employeeId){
        this.employeeId = employeeId;
    }
    public String getEmployeeId(){
        return employeeId;
    }
        
    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }

    public String info(){
        String info = "";

        info += "Employee Id : "+ this.employeeId + "\n";
        info += "Name : "+this.name+ "\n";

        return info;
    }
}
