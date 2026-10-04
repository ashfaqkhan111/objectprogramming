package jobsheet5.experiment3;

public class Clyinder extends Shape {
    protected int t;

    public void setSuperPi(double pi){
        super.pi = pi;
        
    }
    public void setSuperR(int r){
        super.r = r;
    }
    public void setSuperT(int t){
        this.t = t;
    }

    public void volume (){
        System.out.println("Volume of clyinder is : "+(super.pi*super.r*super.r*this.t));
    }
    
}
