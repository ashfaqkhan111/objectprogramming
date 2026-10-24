package jobsheet9.exp2;

public class UnderGraduate extends Student implements Icumlaude {

    public UnderGraduate(String name){
        super(name);
    }

    @Override 
    public void graduate(){
        System.out.println("i have completed my master thesis");
    }

    @Override 
    public void achiveHighGpa(){
        System.out.println("i have 3.71 gpa");
    }
    
}
