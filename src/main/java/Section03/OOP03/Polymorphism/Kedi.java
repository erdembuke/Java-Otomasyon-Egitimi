package Section03.OOP03.Polymorphism;

public class Kedi extends Hayvan{
    public Kedi(String isim, String cins, int yas) {
        super(isim, cins, yas);
    }

    @Override
    void sesCikar() {
        System.out.println("Miyav miyav...");
    }

    public void komut() {
        System.out.println("kedi ismi buraya geldi " + super.isim); // protected ile parent class'daki attribute eristik
    }
}
