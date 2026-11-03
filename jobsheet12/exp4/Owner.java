package jobsheet12.exp4;

public class Owner {

    public void pay(Payable p){
        
        System.out.println("Total electric bill payment : "+p.getPaymentAmount());

        if(p instanceof ElectrictyBill){
            ElectrictyBill eb = (ElectrictyBill) p;

            System.out.println(""+eb.getBillInfo());
        }else if (p instanceof PermanentEmployee){
            PermanentEmployee pe = (PermanentEmployee) p;

            System.out.println(""+pe.getEmployeeInfo());
        }
    }

    public void showMyEmployee(Employee e){
        System.out.println(""+e.getEmployeeInfo());

        if(e instanceof PermanentEmployee){
            System.out.println("you have to pay him/her monthly!");
        }else{
            System.out.println("no need to pay him/her");
        }
    }
    
}
