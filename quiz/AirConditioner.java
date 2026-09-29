package quiz;

public class AirConditioner {
    private String brand;
    private int productionYear;
    private Compressor mianCompressor;
    private Remote mianRemote;
public AirConditioner( String brand, int productionYear, Compressor mianCompressor, Remote mianRemote ){
    this.brand = brand;
    this.productionYear = productionYear;
    this.mianCompressor = mianCompressor;
    this.mianRemote = mianRemote;
}

public void  setBrand (String brand){
    this.brand = brand;
}
public  String getBand (){
    return brand;
    
}

public void  setProductionYear (int productionYear){
    this.productionYear = productionYear;
}
public  int getProductionYear (){
    return  productionYear;
}

public void  setMianCompressor (Compressor mianCompressor){
    this.mianCompressor = mianCompressor;
}
public  Compressor getMainCompressor (){
    return mianCompressor;
}

public void  seMainRemote (Remote mianRemote){
    this.mianRemote = mianRemote;
}
public  Remote getMainRemote (){
    return mianRemote;
}
}
