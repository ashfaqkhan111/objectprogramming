package jobsheet9.exp2;

public class PostGraduate extends Student implements Icumlaude {

    public PostGraduate(String name){
        super(name);
    }

    @Override 
    public void graduate(){
        System.out.println("I have completed my undergraduate thesis");
    }

    @Override 
    public void achiveHighGpa(){
        System.out.println("i achive 3.71 gpa");
    }
    
}
