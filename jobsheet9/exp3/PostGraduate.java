package jobsheet9.exp3;

public class PostGraduate extends Student implements Icumlaude, OutstindingStudent{

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

    @Override 
    public void winCompitition(){
        System.out.println("I won the international compitition");
    }

    @Override 
    public void publishArticle(){
        System.out.println("i have published a scientific article");
    }
    
}
