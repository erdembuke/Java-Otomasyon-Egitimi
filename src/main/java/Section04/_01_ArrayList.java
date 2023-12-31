package Section04;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> isimlerListesi = new ArrayList<>();
        isimlerListesi.add("Erdem");
        isimlerListesi.add("Enes");
        isimlerListesi.add("Seyma");

        System.out.println(isimlerListesi);
        System.out.println("* ////// *");

        // add
        isimlerListesi.add("Ismail");
        isimlerListesi.add("Saduman");
        System.out.println(isimlerListesi);

        // get
        System.out.println(isimlerListesi.get(2)); // seyma
        System.out.println(isimlerListesi.get(0)); // erdem

        // update
        isimlerListesi.set(1,"Emrah"); // enes i emrah ile degistirdik
        System.out.println(isimlerListesi);

        // remove
        isimlerListesi.remove(3); // Ismail kaldirildi
        System.out.println(isimlerListesi);
        String cikarilanIsim = isimlerListesi.remove(0);
        System.out.println(cikarilanIsim + " listeden atildi");
        System.out.println(isimlerListesi);

        // adding more...
        isimlerListesi.add("Canberk");
        isimlerListesi.add("Sofia");
        isimlerListesi.add("Gisila");
        System.out.println(isimlerListesi);
        System.out.println("listemizin eleman sayisi " + isimlerListesi.size());

        // contains (true, false)
        System.out.println("Listemizde ozan ismi " + isimlerListesi.contains("Ozan")); // false
        System.out.println("Listemizde erdem ismi " + isimlerListesi.contains("Erdem")); // false
        System.out.println("Listemizde Saduman ismi " + isimlerListesi.contains("Saduman")); // true

        // indexof
        System.out.println("Canberk ismin liste indexi: " + isimlerListesi.indexOf("Canberk"));

        // isEmpty
        System.out.println(isimlerListesi.isEmpty()); // true or false, dolu mu bos mu, false

        System.out.println("* --------------------- *");

        for (String list : isimlerListesi) {
            System.out.println(list);
        }


    }
}
