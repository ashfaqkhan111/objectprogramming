package UTS;

public class PatrolRobot extends Robot {
  public Battry robotBattry;

  public PatrolRobot (){

  }

  public PatrolRobot (String name, int CPUSpeed,int power, Battry robotBattry){
    super(name,CPUSpeed,power);

    this.robotBattry = robotBattry;
  }

  public void increasePower(int increasePower){
    super.power += increasePower;
  }

  

    
}
