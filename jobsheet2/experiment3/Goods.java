package objectprogramming.jobsheet2.experiment3;

public class Goods {
    public String nameItem;
    public String typeOfItem;
    public int stock;

    public void viewGoods(){
        System.out.println("Name of item : "+nameItem);
        System.out.println("Type of item : "+typeOfItem);
        System.out.println("Stock available : "+ stock);

    }

    public int availableStock (int incomingStock){
            int newStock = incomingStock+stock;

            return newStock;
    }
}
