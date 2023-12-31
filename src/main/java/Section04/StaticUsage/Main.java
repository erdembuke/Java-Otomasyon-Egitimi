package Section04.StaticUsage;

public class Main {
    public static void main(String[] args) {
        Araba ilkAraba = new Araba();
        ilkAraba.setBrand("Volvo");
        System.out.println("1. Arabamin modeli " + ilkAraba.getBrand() + " ve fiyati " + Araba.carPrice);
        Araba.carPrice = 450000; // ikinci arabanin fiyati da otomatik 450bin oldu, cunku ikisi icin de degisir(static)
        System.out.println("1. Arabamin modeli " + ilkAraba.getBrand() + " ve fiyati " + Araba.carPrice);

        Araba ikinciAraba = new Araba();
        ikinciAraba.setBrand("Saab");
        System.out.println("2. Arabamin modeli " + ikinciAraba.getBrand() + " ve fiyati " + ikinciAraba.carPrice);
                                                                                        // nesne uzerinden ulasmaya gerek yok
        Araba ucuncuAraba = new Araba();
        ucuncuAraba.setBrand("Renault");
        System.out.println("3. arabamin modeli " + ucuncuAraba.getBrand() + " ve fiyati " + Araba.carPrice);
    }
}
