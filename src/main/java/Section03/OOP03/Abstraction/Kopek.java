package Section03.OOP03.Abstraction;

public class Kopek extends Hayvan{
    private String isim;
    private String cins;
    private String yas;

    public Kopek(String isim, String cins, String yas) {
        this.isim = isim;   // this ile sinif icindeki attribute i belirtiyoruz
        this.cins = cins;
        this.yas = yas;
    }



    public String getIsim(){
        return this.isim;
    }

    public String getCins() {
        return this.cins;
    }

    public String getYas() {
        return this.yas;
    }

    public void setIsim(String isim){
        this.isim = isim;
    }

    @Override
    void sesCikar() {
        System.out.println("Hav Hav");
    }
}
