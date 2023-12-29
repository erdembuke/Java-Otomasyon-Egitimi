package Section03.OOP03.Homework;

public class Araba {
    private String kasaTipi;
    private String model;
    private int kullanimKm;
    private int fiyat;
    private int kapi;

    Araba(String _kasaTipi, String _model, int _kullanimKm, int _fiyat, int _kapi) {
        this.kasaTipi = _kasaTipi;
        this.model = _model;
        this.kullanimKm = _kullanimKm;
        this.fiyat = _fiyat;
        this.kapi = _kapi;
    }

    public void arabayiSur(int surulenKm) {
        this.kullanimKm += surulenKm;
        System.out.println("Araba guncel kilometresi: " + this.kullanimKm);
    }

    public int satisFiyat(int yeniSatisFiyati) {
        return this.fiyat = yeniSatisFiyati;
    }

    public String kasaTipi() {
        return kasaTipi;
    }

    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKullanimKm() {
        return kullanimKm;
    }

    public void setKullanimKm(int kullanimKm) {
        this.kullanimKm = kullanimKm;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getKapi() {
        return kapi;
    }

    public void setKapi(int kapi) {
        this.kapi = kapi;
    }
}
