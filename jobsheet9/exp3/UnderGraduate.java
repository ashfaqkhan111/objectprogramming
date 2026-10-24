package jobsheet9.exp3;

public class UnderGraduate extends Student implements Icumlaude, OutstindingStudent {

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

    @Override 
    public void winCompitition(){
        System.out.println("I won the international compitition");
    }

    @Override 
    public void publishArticle(){
        System.out.println("i have published a scientific article");
    }
    
}
