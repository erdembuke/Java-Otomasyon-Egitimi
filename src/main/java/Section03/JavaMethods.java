package Section03;

public class JavaMethods {

    // default -> def modifier, paket icinden gorunur ve erisilebilir
    // public -> tum projenin kullanimina sunariz
    // private -> yalnizca ayni sinif icinden erisilebilir, en kisitlayici erisim
    // protected -> aynı paket ve kendi sinifinin tum alt siniflarindan (inheritance) erisilebilir

    // methodlar cagrildiginda icinde bahsedilen eylemleri gerceklestiren kod blogu
    // methoda parametreler ekleyebiliriz, sadece cagirildiginda methodlar kod yurutur
    // public void printWords() -> access modifier, geri donus tipi, method ismi ve parametresi

    public static void main(String[] args) {
        printConsole();
        printConsole();
        printCity();
        printCity();

        printConsole("Erdem");
        printConsole("Seyma");

        totalNumber(5,10);
        totalNumber(312312,11251253);

        // konsola kisinin adi ve sinav notunu yazdiran method
        printStudent("Erdem",95);
        printStudent("Seyma",80);

        // Return tipi olan methodlar
        int carpma = timesNumber(5,77);
        System.out.println(carpma);

        // degisken tanimlamadan print icinde method cagirabiliriz
        System.out.println(timesNumber(5,77)); // prints 77 * 5
        System.out.println(timesNumber(120,48)); // prints 120 * 48

        // toplama method u ile
        System.out.println(totalNumberReturn(10,57));
        System.out.println(totalNumberReturn(12353651,61321253));

        // toplama method u overload (2 yerine 3 parametre verdim)
        System.out.println(totalNumberReturn(1,2,3));
        System.out.println(totalNumberReturn(123,51,22));

        // toplama method u overload (2 parametreli DOUBLE return)
        System.out.println(totalNumberReturn(12.15,25.74,99.75));


    }

    private static void printConsole() {
        System.out.println("Hello World!");
    }

    private static void printCity() {
        System.out.println("Istanbul");
    }

    private static void printConsole(String a) { // method overload
        System.out.println("Merhaba " + a);
    }

    private static void totalNumber(int a, int b) {
        System.out.println("Total is " + (a+b));
    }

    // konsola kisinin adi ve sinav notunu yazdiran method
    private static void printStudent(String name, int grade){
        System.out.println("Student: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("*--------*");
    }

    // Return tipi olan methodlar
    private static int timesNumber(int a, int b) {
        return a*b;
        // int carpmaSonucu = a*b;
        // return carpmaSonucu;
    }

    private static int totalNumberReturn(int a, int b) {
        return a+b;
    }

    // method overload
    private static int totalNumberReturn(int a, int b, int c) {
        return (a+b+c);
    }

    private static double totalNumberReturn(double a, double b, double c) {
        return a+b+c;
    }
}
