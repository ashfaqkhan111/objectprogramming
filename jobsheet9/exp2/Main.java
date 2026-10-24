package jobsheet9.exp2;

public class Main {
    public static void main(String[] args) {
       
        Rector rector = new Rector();

        Student student = new Student("charlie");

        PostGraduate postGraduate = new PostGraduate("Dini");

        UnderGraduate underGraduate = new UnderGraduate("Elok");

        
        rector.awardCumlaudCertificate(underGraduate);
        rector.awardCumlaudCertificate(postGraduate);
    }
    
}
