package Section02;

public class _01_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        double c = 55.12;

        // Aritmetik operatorler

        System.out.println(a+b);    // 30
        System.out.println(b-a);    // 10
        System.out.println(a*b);    // 200
        System.out.println(b/a);    // 2

        System.out.println(a+c); // 65.12

        System.out.println("* ------------ *");

        // ++ , --
        System.out.println(++a); // 11
        System.out.println(++a); // 12

        System.out.println(--b); // 19
        System.out.println(--b); // 18

        System.out.println("* ------------ *");
        // Atama operatorleri

        int d = 50;     // = atama operatoru, d yi 50 ye atadik.
        d = d+3;        // 53
        d += 3;         // 56
        d -= 3;         // 53
        d *= 2;         // 106
        d /= 2;         // 53
        d -= 3;         // 50
        System.out.println(d);

        System.out.println("* ----------- *");

        // Karsilastirma operatorleri
        int e = 30;
        int f = 40;
        int g = 50;

        // == , != , > , < , => , <=

        System.out.println(e == f);     // false
        System.out.println(e != f);     // true
        System.out.println(e > f);      // false
        System.out.println(e < f);      // true
        System.out.println(e >= f);     // false
        System.out.println(e <= f);     // true

        if (e != f)
            System.out.println("kosul saglandi");

        if (e > 29 && c < 51) // e 29den kucukse VE c 51den kucukse
            System.out.println("kosul saglandi");

        // iki adet integer, 85 ve 45
        // konsola degiskenleir kullanarak iki ayri satirda sayilarin toplamini ve carpini yazdirin
        // ornek: sayilarin toplami 130 dur
        // eger sayilarin carpimi 3000 den buyuk ve e 4000 den kucukse, konsola sayilarin carpim degerini yazdirin

        int h = 85;
        int j = 45;

        int toplam = h+j;
        int carpim = h*j;

        System.out.println("sayilarin toplami " + toplam + " degerindedir.");
        System.out.println("sayilarin carpimi " + carpim + " degerindedir");

        if (carpim > 3000 && carpim < 4000)
            System.out.println("Sayilarin carpim degeri " + carpim);




    }
}
