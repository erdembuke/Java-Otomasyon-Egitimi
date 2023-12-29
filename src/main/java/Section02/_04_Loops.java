package Section02;

public class _04_Loops {
    public static void main(String[] args) {

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println("Degiskenimizin degeri " + i);
        }

        // i degerini 1 yerine 0.25 artirmak
        for (double i = 0; i < 10; i += 0.25) {
            System.out.println("Degiskenimizin degeri " + i);
        }

        System.out.println("* ----------------- *");

        int sayfa = 5;
        for (int i = 1; i <= sayfa; i++) {
            System.out.println("Sayfa " + i);
            if (i == 3)
                System.out.println("kosul saglandi");
        }

        System.out.println("* ----------------- *");

        String[] names = {"Ozan", "Onur", "Hazal", "Tibet"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Listedeki " + (i + 1) + ". isim " + names[i]);
        }

        System.out.println("*-------------------*");

        // Enhanced for loop
        System.out.println("Gelismis dongu ile yazilmis isimler:");

        for (String abc : names) {
            System.out.println(abc);
        }

        System.out.println("*--------------------*");
        System.out.println("While Loops");
        System.out.println("*--------------------*");

        // While loop

        // i 1 den 5 e kadar deger alabilir
        // i degerlerini konsola yazdir

        for (int i = 1; i <= 5; i++) {
            System.out.println("for loop ile " + i);
        }

        System.out.println("-----");

        int j = 1;
        while (j <= 5) {
            System.out.println("while loop ile " + j);
            j++;
        }

        System.out.println("-----");

        // true ile while
        j = 1;
        while (true) {
            if (j > 5) {
                break;
            }
            System.out.println("true while ile " + j);
            j++;
        }

        System.out.println("-----");

        // true do while
        j = 1;
        do {
            if (j > 5)
                break;
            System.out.println("true do while ile " + j);
            j++;
        } while (true);

        System.out.println("-----");

        // do while
        j = 1;
        do {
            System.out.println("do while ile " + j);
            j++;
        } while (j <= 5);


        // Loop odev
        // "Hello World!" yazimiz mevcut
        // Bu yazi icindeki 'o' lari 0 ile degistir

        String hello = "Hello World!";
        int index = 0;
        char bulunanChar;
        String yeniString = ""; // o larin 0 ile degistirilmis halini bu String e atayacagiz

        while (index < hello.length()) {
            bulunanChar = hello.charAt(index);
            if (bulunanChar == 'o')
                yeniString += "0";
            else
                yeniString += bulunanChar;

            index++;

        }

        System.out.println(yeniString);

    }
}
