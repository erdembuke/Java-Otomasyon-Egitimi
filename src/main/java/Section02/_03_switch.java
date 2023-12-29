package Section02;

public class _03_switch {
    public static void main(String[] args) {
        int sayi = 3;

        // if else ile
        if(sayi == 1)
            System.out.println("sayi 1");
        else if (sayi == 2)
            System.out.println("sayi 2");
        else
            System.out.println("sayi 1 ya da 2 ye esit degil");


        // switch
        switch (sayi) {
            case 1:
                System.out.println("sayi 1");
                break;
            case 2:
                System.out.println("sayi 2");
                break;
            case 3:
                System.out.println("sayi 3");
                break;
            default:
                System.out.println("sayi 1,2 ya da 3 degil");
                break;
        }

        int bulundugumuzAy = 12;

        switch (bulundugumuzAy) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Boyle bir ay yok");
                break;

        }

        String browser = "Chrome";

        switch (browser){
            case "Chrome":
                System.out.println("Chrome baslatildi");
                //webDriver.startDriver.startChrome
                break;
            case "Firefox":
                System.out.println("Firefox baslatildi");
                // webDriver.startDriver.startFirefox
                break;
            default:
                System.out.println("Tanimlanmamis bir browser baslatilamaz!");
        }

        // Odev
        // Bir haftanin 7 gunu vardir, her gun icin ayri cikti yazdirin

        int gun = 1;

        switch (gun) {
            case 1:
                System.out.println("Pzt");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cmt");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Haftanin 7 gunu vardir, yanlis input");
        }

        // java 14 ve sonrasi switch basitlestirildi , break koymadan bu sekilde kullanilabilir

        switch (gun) {
            case 1 -> System.out.println("Pzt");
            case 2 -> System.out.println("Sali");
            case 3 -> System.out.println("Cars");
            case 4 -> System.out.println("Pers");
            case 5 -> System.out.println("Cuma");
            case 6 -> System.out.println("Cmt");
            case 7 -> System.out.println("Pazar");
            default -> System.out.println("Yanlis input, Haftada 7 gun vardir!");
        }

    }
}
