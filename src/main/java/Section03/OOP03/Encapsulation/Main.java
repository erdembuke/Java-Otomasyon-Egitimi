package Section03.OOP03.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Kopek ilkKopek = new Kopek("Nazli","Sibirya Kurdu","9");

        System.out.println("Kopegimin adi " + ilkKopek.getIsim() + ", cinsi " + ilkKopek.getCins() + ", yasi " +
                ilkKopek.getYas());

        ilkKopek.setIsim("Helin");
        System.out.println("Kopegimin yeni ismi " + ilkKopek.getIsim());

        Kopek ikinciKopek = new Kopek("Duman", "Kangal","4");

    }
}
