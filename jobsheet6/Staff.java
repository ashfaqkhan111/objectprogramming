package jobsheet6;

public class Staff extends Employee {

    private double overTime;
    private double overTimeSalary;

    public Staff(){

    }

    public Staff (String name, String nip, String rank, double salary, double overTime, double overTimeSalary){
        this.overTime = overTime;
        this.overTimeSalary = overTimeSalary;
    }

    public void setOverTime(double overTime){
        this.overTime = overTime;
    }
    public Double getOvetTime(){
        return overTime;
    }

    public void setOverTimeSalary(double overTimeSalary){
        this.overTimeSalary = overTimeSalary;
    }
    public Double getOverTimeSalary(){
        return overTimeSalary;
    }

    public double getSalary(double overTime, double overTimeSalary){
        return super.getSalary()+overTime*overTimeSalary;
    }

    public double getSalary(){
        return super.getSalary()+overTime*overTimeSalary;
    }

    public void viewInfo(){
        System.out.println("NIP : "+this.getNip());
        System.out.println("Name : "+this.getName());
        System.out.println("Rank : "+this.getRank());
        System.out.println("over Time : "+this.getOvetTime());
        System.out.println("Over time salary : "+this.getOverTimeSalary());
        System.out.println("Total salary : "+this.getSalary(overTime, overTimeSalary));
        
    }
    
}
