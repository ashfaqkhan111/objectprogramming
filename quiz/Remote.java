package quiz;

public class Remote {

    private String langauge ;
    private  int battryNumber;

    public Remote (String langauge, int battryNumber){
        this.langauge = langauge;
        this.battryNumber = battryNumber;
    }
    public void  setLangauge (String langauge){
        this.langauge = langauge;
    }
    public String getLangauge (){
        return langauge;
    }

    public void  setBattryNumber (int battryNumber){
        this.battryNumber = battryNumber;
    }
    public int getBattryNumber (){
        return battryNumber;
    }

    
}
