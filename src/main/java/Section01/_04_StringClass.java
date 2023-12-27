package Section01;

public class _04_StringClass {
    public static void main(String[] args) {

        String ilkMetin = "Test Otomasyonu";
        System.out.println(ilkMetin);

        String ikinciMetin = "C++ Programlama Dili";
        System.out.println(ikinciMetin);

        int ilkMetinKarakterSayisi = ilkMetin.length(); // 15 - bosluk da karakter sayilir
        System.out.println("ilkMetinKarakterSayisi = " + ilkMetinKarakterSayisi);

        int ikinciMetinKarakterSayisi = ikinciMetin.length(); // 20
        System.out.println("ikinciMetinKarakterSayisi = " + ikinciMetinKarakterSayisi);

        String kucukHarf = ilkMetin.toLowerCase(); // ilk metini kucuk harfe cevirir
        System.out.println("kucukHarf = " + kucukHarf);

        String buyukHarf = ikinciMetin.toUpperCase(); // ikinci metin buyuk harfe cevirir
        System.out.println("buyukHarf = " + buyukHarf);

        System.out.println(kucukHarf + " " + buyukHarf); // + isareti ile 2 stringi bagladik
        System.out.println(kucukHarf + " " + buyukHarf + " " + ilkMetinKarakterSayisi + " " + ikinciMetinKarakterSayisi);

        String yeniString = "En sevdigim film \"Avatar\""; // string icinde tirnak isareti koymak icin \"
        System.out.println(yeniString + "\n"); // \n bir alt satira gecer


    }
}
