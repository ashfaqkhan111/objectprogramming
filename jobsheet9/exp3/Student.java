package jobsheet9.exp3;

public class Student {

    protected String name;

    public Student (String name){
        this.name = name;
    }

    public void attendClasses(){
        System.out.println("My name is : "+this.name);
        System.out.println("i attended classes on campus");
    }
    
}
