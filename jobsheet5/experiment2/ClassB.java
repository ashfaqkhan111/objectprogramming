package jobsheet5.experiment2;

public class ClassB extends ClassA {
    private int z;
    
    public void setZ(int z){
        this.z = z;
    }

    public void getResultZ(){
        System.out.println("result z : "+z);

    }
    public void getTotal(){
        System.out.println("total result : "+(getX()+getY()+z));
    }
    
}
