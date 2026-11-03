package jobsheet12.task;

public class JumpingZombies extends Zombie {

    public JumpingZombies(int health, int level){
        super(health, level);
    }

    public void heal(){

        int percent = 0;

        switch (level) {
            case 1: percent = 30; break;

            case 2: percent = 40; break;

            case 3: percent = 50; break;
        
            default:
                System.out.println("invalid level");
                break;
        }

        
    }
    @Override 
    public void destroyed (){
        health -= health*1 /100;

        System.out.println("jumping zombie destroyed");
    }
    @Override 
    public String getZombiesInfo(){
        return "Jumping zombie : "+super.getZombiesInfo();
    }
    
}
