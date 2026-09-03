package objectprogramming.jobsheet2.experiment3;

public class TestGoods {
    public static void main(String[] args) {
        Goods g1 = new Goods();

        g1.nameItem = "pensil";
        g1.typeOfItem = "ATK";
        g1.stock = 10;

        g1.viewGoods();
    }
}
