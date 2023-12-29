package Section03.OOP03.Polymorphism;

public class Kopek extends Hayvan {


    public Kopek(String isim, String cins, int yas) {
        super(isim, cins, yas);
    }

    @Override
    void sesCikar() {
        System.out.println("Hav Hav");
    }

    @Override
    public void uyu() {
        super.uyu(); // super classtaki uyku cagirildi
        // method override ile sinifa ozel uyuma metodunu duzenledik
        System.out.println("kopek uyurken horluyor");
    }
}
