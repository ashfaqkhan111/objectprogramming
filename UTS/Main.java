package UTS;

public class Main { 

    public static void main(String[] args) {
        Battry br = new Battry(16000);
        PatrolRobot pr = new PatrolRobot("ASIMO", 2048, 150,br);

        pr.increasePower(20);

        System.out.println("Name : "+pr.name);
        System.out.println("CPU Speed : "+pr.CPUSpeed);
        System.out.println("Power : "+ pr.power);

        System.out.println("Battry capecity : "+br.capecity);

        

        
    }
    
}
