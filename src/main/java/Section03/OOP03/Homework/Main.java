package Section03.OOP03.Homework;

public class Main {
    public static void main(String[] args) {
        /*
        3 adet sinif olusturun: Araba, sedan, hatchback
        3 sinif arasindaki iliskiyi tanimla
        kasaTipi, model, kullanimKm, fiyat ve kapi degiskenlerini tanimla
        arabayiSut method u olusturun. bu metot ile arabanin km si verilen deger ile artirilsin ve konsola bir yazi yazilsin
        tum siniflarda constructor olamli ve degiskenlerin tamami ya da bir kismi constructorlarda tanimlanmali
        satisFiyati adinda bir metot olusturarak arabanin satis fiyatini belirleyin
        ana sinifta 2 farkli arac olusturarak, bu araclari surup, fiyatlarini guncelleyin.
         */

        Sedan saab93 = new Sedan("Saab", 240150, 550000, 5);
        System.out.println("Arac modeli " + saab93.getModel() + " / kullanim km " + saab93.getKullanimKm() +
                " / fiyati " + saab93.getFiyat() + " / kapi sayisi " + saab93.getKapi());

        saab93.arabayiSur(700); // 700 km artirdik
        saab93.satisFiyat(540000); // degeri 10bin tl düssün

        System.out.println("Arac modeli " + saab93.getModel() + " / kullanim km " + saab93.getKullanimKm() +
                " / fiyati " + saab93.getFiyat() + " / kapi sayisi " + saab93.getKapi());

        saab93.arabayiSur(50000); // 50000 km artirdik
        saab93.satisFiyat(450000); // fiyati 450bin tlye dustu

        System.out.println("Arac modeli " + saab93.getModel() + " / kullanim km " + saab93.getKullanimKm() +
                " / fiyati " + saab93.getFiyat() + " / kapi sayisi " + saab93.getKapi());

        System.out.println("* ---------------------------------- *");

        Hatchback a3 = new Hatchback("Audi", 120357, 870000, 5);

        System.out.println("Arac modeli " + a3.getModel() + " / kullanim km " + a3.getKullanimKm() +
                " / fiyati " + a3.getFiyat() + " / kapi sayisi " + a3.getKapi());

        a3.arabayiSur(23000);
        a3.satisFiyat(850000);

        System.out.println("Arac modeli " + a3.getModel() + " / kullanim km " + a3.getKullanimKm() +
                " / fiyati " + a3.getFiyat() + " / kapi sayisi " + a3.getKapi());

    }
}
