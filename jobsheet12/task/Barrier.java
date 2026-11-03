package jobsheet12.task;

public class Barrier implements  Destoryable{

    private int strength;

    public Barrier (int strength){
        this.strength = strength;
    }

    public void setstrength(int strength){
        this.strength = strength;
    }

  
    
    public int getStrength(){
        return strength;
    }

      public void destroy(){
        strength -= 10;

        if (strength < 0){
            strength =0 ;

        }

        System.out.println("barrier destroyed");
    }

    @Override 
    public void destroyed(){
        destroy();

    }

    public String getBarrierInfo(){

        return "barrier strength : "+strength;

    }
}
