package jobsheet5.experiment5;

public class Employee {
    public String name;
    public String address;
    public int age;
    public String gender;
    public int salary;

    public Employee(){

    }

    public Employee(String name,String address, int age, String gender, int salary){
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public void displayEmployeeData(){
        System.out.println("name : "+name);
        System.out.println("addres : "+address);
        System.out.println("age : "+age);
        System.out.println("gender : " +gender);
        System.out.println("salary : "+salary);
    }

    
}
