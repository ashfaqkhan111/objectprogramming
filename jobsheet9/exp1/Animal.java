package jobsheet9.exp1;

public abstract class Animal {

    protected int age;

    protected  Animal(){
        this.age =0;
    }

    public void setAge(){
        this.age +=1;
    }

    public abstract void move();

    
} 