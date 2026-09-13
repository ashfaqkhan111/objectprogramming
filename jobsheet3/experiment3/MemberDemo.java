package jobsheet3.experiment3;

public class MemberDemo {
    public static void main(String[] args) {
        Members member = new Members();
        member.setName("khan");
        member.setAddress("malang");
        member.deposit(10000);
        System.out.println("deposit for member : "+member.getName());
        System.out.println("savings : "+member.getSavings());
        
    }
}
