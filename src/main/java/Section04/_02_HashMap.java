package Section04;

import java.util.ArrayList;
import java.util.HashMap;

public class _02_HashMap {
    public static void main(String[] args) {
        // HashMap - key-value oldugu icin daha performansli diyebiliriz

        HashMap<String,Integer> stdGrade =  new HashMap<String,Integer>();
        stdGrade.put("Erdem",88);
        stdGrade.put("Seyma",97);
        stdGrade.put("Emrah",75);
        stdGrade.put("Tibet",42);

        System.out.println(stdGrade);
        // spesifik bir key in value sini cagirma
        System.out.println("Seyma ders notu " + stdGrade.get("Seyma"));
        // listedeki butun keyler
        System.out.println("Butun anahtar degerleri " + stdGrade.keySet());
        // listedeki butun valueler
        System.out.println("Butun degerler " + stdGrade.values());
        // butun liste
        System.out.println("Butun girdi ciftleri " + stdGrade.entrySet());
        // replace
        stdGrade.remove("Erdem",59);
        // remove
        stdGrade.remove("Emrah"); // emrah'i remove ettik
        System.out.println(stdGrade);

        /*
        ODEV :
        Ogrencilerin adini, Soyadini, dersini, ve notunu tutan bir harita olusturmak istiyoruz
        sonrasinda ogrencilerden bir liste olusturalim
        Ogrenci 1: John / Doe / Matematik / 90
        Ogrenci 2: Kate / Win / Fizik / 100
        Ogrenci 3: Juan / Jose / Spor / 20
         */

        HashMap<String,String> ilkOgrenci = new HashMap<>();
        ilkOgrenci.put("Isim","John");
        ilkOgrenci.put("Soyisim","Doe");
        ilkOgrenci.put("Ders","Matematik");
        ilkOgrenci.put("Not","90");

        System.out.println(ilkOgrenci);

        HashMap<String,String> ikinciOgrenci = new HashMap<>();
        ikinciOgrenci.put("Isim","Kate");
        ikinciOgrenci.put("Soyisim","Win");
        ikinciOgrenci.put("Ders","Fizik");
        ikinciOgrenci.put("Not","100");

        System.out.println(ikinciOgrenci);

        HashMap<String,String> ucuncuOgrenci = new HashMap<>();
        ucuncuOgrenci.put("Isim","Juan");
        ucuncuOgrenci.put("Soyisim","Jose");
        ucuncuOgrenci.put("Ders","Spor");
        ucuncuOgrenci.put("Not","20");

        System.out.println(ucuncuOgrenci);
        System.out.println("*  -----------------------  *");

        // ogrencilerden tipi hashmap olan arraylist olusturduk
        ArrayList<HashMap<String,String>> stdList = new ArrayList<>();
        // ogrencileri ekliyoruz
        stdList.add(ilkOgrenci);
        stdList.add(ikinciOgrenci);
        stdList.add(ucuncuOgrenci);

        System.out.println(stdList);
        System.out.println(stdList.get(0)); // ilk ogrenci verileri
        System.out.println(stdList.get(0).get("Not")); // ilk ogrenci notu

        
    }
}
