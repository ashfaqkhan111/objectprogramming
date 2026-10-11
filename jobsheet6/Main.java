package jobsheet6;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========TESTING=============");

        Manager man[] = new Manager[2];
        Staff staff1[] =  new Staff[2];
        Staff staff2[] = new Staff[3];

        man[0] = new Manager();
        man[0].setName("tedjo");
        man[0].setNip("101");
        man[0].setRank("1");
        man[0].setAllowence(500000);
        man[0].setDepartment("Administration");

        man[1]= new Manager();
        man[1].setName("Atika");
        man[1].setNip("103");
        man[1].setRank("3");
        man[1].setAllowence(25000000);
        man[1].setDepartment("accunting");

        staff1[0] = new Staff();
        staff1[0].setName("Usman");
        staff1[0].setNip("00003");
        staff1[0].setRank("2");
        staff1[0].setOverTime(10);
        staff1[0].setOverTimeSalary(10000);

        staff1[1] = new Staff();
        staff1[1].setName("Anugrah");
        staff1[1].setNip("0005");
        staff1[1].setRank("2");
        staff1[1].setOverTime(10);
        staff1[1].setOverTimeSalary(55000);

        man[0].setStaff(staff1);

        staff2[0] = new Staff();
        staff2[0].setName("Hendra");
        staff2[0].setNip("0004");
        staff2[0].setRank("3");
        staff2[0].setOverTime(15);
        staff2[0].setOverTimeSalary(5500);

        staff2[1] = new Staff();
        staff2[1].setName("Arie");
        staff2[1].setNip("0006");
        staff2[1].setRank("4");
        staff2[1].setOverTime(5);
        staff2[1].setOverTimeSalary(100000);

        staff2[2] = new Staff();
        staff2[2].setName("Mentari");
        staff2[2].setNip("0007");
        staff2[2].setRank("3");
        staff2[2].setOverTime(6);
        staff2[2].setOverTimeSalary(20000);

        man[1].setStaff(staff2);

        man[0].viewInfo();
        man[1].viewInfo();
    }
    
}
