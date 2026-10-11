package jobsheet6;

public class Employee {

    private String name;
    private String nip;
    private String rank;
    private double salary;

    public Employee(){

    }

    public Employee(String name, String nip, String rank, double salary){
        this.name = name;
        this.nip = nip;
        this.rank = rank;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setNip(String nip){
        this.nip = nip;
    }
    public String getNip(){
        return nip;
    }

    public void setRank(String rank){
        this.rank = rank;

        switch (rank.charAt(0)) {
            case 1:this.salary = 5000000;
                
                break;
            case 2: this.salary = 30000000;
                break;
            case 3: this.salary = 2000000;
                break;
            case 4: this.salary = 1000000;
                break;
            case 5: this.salary = 750000;
                break;
        
            default:
                break;
        }
    }
    public String getRank(){
        return rank;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    


    
}
