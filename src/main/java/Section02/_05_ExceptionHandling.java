package Section02;

public class _05_ExceptionHandling {
    public static void main(String[] args) {

        try {
            int[] sayilar = {1, 5, 10, 555, 678};
            System.out.println(sayilar[6]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace(); // hatayi program sonunda yazdirir, sonrasindaki kodlar da execute edilir
        }

        System.out.println("Hata sonrasi konsola yazdir");

    }
}
