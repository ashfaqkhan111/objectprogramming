package quiz;

public class Main {
    public static void main(String[] args) {
        Compressor comp = new Compressor("R32", 1000);
        Remote rmt = new Remote("English", 2);

        AirConditioner ac = new AirConditioner("DAikan", 2019, comp, rmt);

        System.out.println("Ac : " + ac.getBand());
         System.out.println("compressor Catacity : " + ac.getMainCompressor().getCapacity());
         System.out.println("Remote langauge : "+ac.getMainRemote().getLangauge());

    }
    
}
