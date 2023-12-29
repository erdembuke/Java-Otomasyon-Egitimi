package Section03.OOP03.Polymorphism;

abstract class Hayvan {
    protected String isim;
    private String cins;
    private int yas;

    public Hayvan(String isim, String cins, int yas){
        this.isim = isim;
        this.cins = cins;
        this.yas = yas;
    }

    public String getIsim(){
        return this.isim;
    }

    public String getCins() {
        return this.cins;
    }

    public int getYas() {
        return this.yas;
    }

    public void setIsim(String isim){
        this.isim = isim;
    }

    abstract void sesCikar();

    public void uyu() {
        System.out.println("Hayvan uyuyor");
    }
}
