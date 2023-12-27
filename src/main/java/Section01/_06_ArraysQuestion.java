package Section01;

public class _06_ArraysQuestion {
    public static void main(String[] args) {
        /*
        3 adet deger iceren bir array olusturun. Degerler: Java, Python, C
        1 den 5 e kadar seviye iceren bir array olusturun
        bu verileri kullanarak konsola: Java, Python ve C yazilim dillerindeki seviyenizi yazdirin
         */

        String[] arr = new String[3];
        arr[0] = "Java";
        arr[1] = "Python";
        arr[2] = "C";

        int[] dilSeviyesi = new int[5];
        dilSeviyesi[0] = 1;
        dilSeviyesi[1] = 2;
        dilSeviyesi[2] = 3;
        dilSeviyesi[3] = 4;
        dilSeviyesi[4] = 5;

        System.out.println(arr[0] + " dilindeki seviyem : " + dilSeviyesi[3]);
        System.out.println(arr[1] + " dilindeki seviyem : " + dilSeviyesi[0]);
        System.out.println(arr[2] + " dilindeki seviyem : " + dilSeviyesi[2]);
    }
}
