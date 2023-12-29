package Section03.OOP03.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Kedi inek = new Kedi("inek","scottish",3);
        inek.sesCikar();
        inek.uyu();
        inek.komut();

        Kopek ilkKopek = new Kopek("Duman","Kangal",5);
        ilkKopek.sesCikar();
        ilkKopek.uyu(); // sinifa ozel uyu method u (override edilmis) calisacak





    }
}
