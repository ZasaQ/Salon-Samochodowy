import java.sql.Struct;

public class Modyfikacja extends Samochody {
    String nazwa;
    String kolor;
    String fotele;
    String felgi;
    String silnik;
    String pakiet;
    String cenaDodatku;
    Modyfikacja(){
        this.nazwa="";
        this.cenaDodatku="";
    }
    //public boolean sprawdz(){}
    public String getNazwa(){
        return nazwa;
    }
    public void setKolor(String x){
         this.kolor=x;
    }
    public String getKolor(){
         return kolor;
    }
    public void setFotele(String x){
        this.fotele=x;
    }
    public String getFotele(){
        return fotele;
    }
    public void setFelgi(String x){
        this.felgi=x;
    }
    public String getFelgi(){
        return felgi;
    }
    public void setSilnik(String x){
        this.silnik=x;
    }
    public String getSilnik(){
        return silnik;
    }
    public String getPakiet(){

    }
}
