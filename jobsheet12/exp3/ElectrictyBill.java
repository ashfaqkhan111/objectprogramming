package jobsheet12.exp3;

public class ElectrictyBill implements Payable {

    private int kwh;
    private String category;

    public ElectrictyBill(int kwh, String category){
        this.kwh = kwh;
        this.category = category;
    }

    public void setKwh(int kwh){
        this.kwh = kwh;
    }
    public void  setCategory(String category){
        this.category = category;
    }

    public int getKwh (){
        return kwh;
    }
    public String getCategory(){
        return category;
    }

    public int getBasePrice(){
        int bPrice = 0;

        switch(category){
            case "R-1" : bPrice = 100; break;
            case "R-2" : bPrice = 200; break;
        }

        return bPrice;
    }

    @Override 
    public int getPaymentAmount(){
        return kwh*getBasePrice();
    }

    public String getBillInfo(){
        return "KWH = "+kwh+"\n" + "Category = "+ category+"("+getBasePrice()+" per KWH)\n";
    }

  
    
}
