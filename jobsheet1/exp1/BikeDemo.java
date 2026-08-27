package objectprogramming.jobsheet1.exp1;

public class BikeDemo {
    private String brand;
    private int speed;
    private int gear=1;

    private final int [] GEAR_SPEED_LIMITS = {5,10,25,30,40,60};
    public void serBrand (String brandName){
        brand = brandName;

    }

    public void gearChange (int gearVlaue){
        if (gearVlaue < 1 || gearVlaue > 6){
            System.out.println("INvalid gear value gear must be in between 1 and 6");
        }else {
            gear = gearVlaue;
        }
    
    }

    public int speedAccleration (int incerment){
        speed += incerment;

        if (speed > GEAR_SPEED_LIMITS[gear - 1]){
            speed = GEAR_SPEED_LIMITS[gear -1];
        }
        return speed;
    }
    public int speedDeceleration(int decrement){
        speed -= decrement;

        if (speed < 0){
            speed = 0;
        }
        return speed;
    }

    public void printInfo(){
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
        System.out.println("Gear : " + gear);
    }
}
