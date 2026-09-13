package jobsheet3.experiment3;

public class Members {
    
    private String name;
    private String address;
    private float savings;

    public void setName(String name) {
        this.name = name;

    }
    public void setAddress(String address){
        this.address=address;
    }
    public String  getName(){
        return name;
    }
    public String  getAddress(){
        return address;
    }

    public float getSavings() {
        return savings;
    }

    public void deposit(float deposit){
        savings += deposit;
    }

    public void borrow(float borrow){
        savings -= borrow;
    }
    
}
