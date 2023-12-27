package Section01;

public class _02_Variables {
    public static void main(String[] args) {
        // integer
        int ilkSayi; // int = tam sayi
        ilkSayi = 10; // 10 degeri atadik

        System.out.println("ilkSayi = " + ilkSayi); // 10
        System.out.println("ilkSayi");              // ilkSayi seklinde string yazar

        // String
        String ilkMetin = "Hello Automation";
        System.out.println("ilkMetin = " + ilkMetin); // Hello Automation
        System.out.println("ilkMetin");               // ilkMetin

        System.out.println(ilkSayi + " " + ilkMetin);

        System.out.println("Review of Course is " + ilkSayi + "! " + ilkMetin);
    }
}
