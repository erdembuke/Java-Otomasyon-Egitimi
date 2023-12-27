package Section01;

public class _05_Arrays {
    public static void main(String[] args) {
        String[] names = {"Erdem", "Enes", "Emrah", "Seyma", "Ali", "Saduman", "Ismail"};
        int[] yaslar = {24,26,30,23,40,42,45};

        System.out.println(names[0] + " " + names[1]); // Erdem Enes
        System.out.println(names[2] + "gun1993");      // Emrahgun1993
        System.out.println(yaslar[0]);
        System.out.println(yaslar[2]);

        names[3] = "Seymadlrr";
        System.out.println(names[3]);

        String[] webUrl = {"www.sayfa1.com", "www.sayfa2.com"};
        System.out.println(webUrl[0]); // www.sayfa1.com
        System.out.println(webUrl[1]); // www.sayfa2.com

        int diziUzunlugu = names.length;
        System.out.println("diziUzunlugu = " + diziUzunlugu); // 7

        int diziUzunlugu2 = yaslar.length;
        System.out.println("diziUzunlugu2 = " + diziUzunlugu2); // 7

        int diziUzunlugu3 = webUrl.length;
        System.out.println("diziUzunlugu3 = " + diziUzunlugu3); // 2

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " / ");
        }

        System.out.println(); // alt alta yazmasi icin

        for (int i = 0; i < yaslar.length; i++) {
            System.out.print(yaslar[i] + " / ");
        }
    }
}
