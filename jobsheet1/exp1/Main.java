package objectprogramming.jobsheet1.exp1;

public class Main {
    public static void main(String[] args) {
        BikeDemo mountainBike1 = new BikeDemo();
         BikeDemo mountainBike2 = new BikeDemo();
         RoadBike roeadBike1 =  new RoadBike();


         mountainBike1.serBrand("Trek");
         mountainBike1.speedAccleration(10);
         mountainBike1.gearChange(2);
         mountainBike1.printInfo();

         mountainBike1.serBrand("Gaint");
         mountainBike1.speedAccleration(20);
         mountainBike1.gearChange(3);
         mountainBike1.printInfo();

         roeadBike1.serBrand("Specaialized");
         roeadBike1.setTireWidth(25);
         roeadBike1.speedAccleration(15);
         roeadBike1.gearChange(4);
         roeadBike1.printInfo();

    

    }

    public static class RoadBike extends BikeDemo {
        private int tireWidth;
        
        public void setTireWidth(int Width){
            tireWidth = Width;
        }
        @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Tire Width : " + tireWidth + "mm");
        System.out.println("Bike Type : Road Bike");
    }
    }

    
}
