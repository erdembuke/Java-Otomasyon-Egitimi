package JUnit;

import Section05_JUnit.HesapMakinesi;
import org.junit.jupiter.api.*;

public class HesapMakinesiTests { // sinif ismi icinde Test ya da Tests kelimesi bulunmali, basinda ya da sonunda

    // @Disabled("Cikarma method hata mevcut. Hata cozumu sonrasi aktif hale getirilecek")
    // @Test -> test annotation ile beraber kullanilmalidir
    // eger testte hata cikiyorsa, bug kaynakli ise, cözümü zaman alacaksa ve sonradan fix edip sonra kosacaksak
    // disabled ekleyip test kosumunu devre disi birakabilir ve istedigimiz zaman test kosumuna dahil ettirebiliriz

    HesapMakinesi hesapMakinesi;
    @BeforeAll // beforeAll yada afterAll annotation larinda methodlar STATIC olarak tanimlanmali
    public static void setupClass() {
        System.out.println(" BeforeAll setupClass method calistirildi");
    }
    @BeforeEach
    public void setup() {
        hesapMakinesi = new HesapMakinesi(); // her testte nesne olusturdugumuz icin kod tekrari olmamasi icin
        // beforeEach adi altinda her testten once nesne olusturacak sekilde ayarladik, nesneyi diger metodlarda da
        // kullanabilmemiz icin yukarida tanimladik, bu metodda yarattik
        System.out.println("Setup Method Calistirildi"); // konsolda gormek icin egitim amacli yazdik
    }

    @Test
    public void toplamaTest() {
        double toplamaSonuc = hesapMakinesi.toplama(1.5,3.6);
        Assertions.assertEquals(5.1,toplamaSonuc);

    }

    // @Disabled("Cikarma method hata mevcut. Hata cozumu sonrasi aktif hale getirilecek")
    @Test
    public void cikartmaTest() {
        double cikartmaSonuc = hesapMakinesi.cikartma(5.7,3.1);
        Assertions.assertEquals(2.6,cikartmaSonuc);

    }

    @Test
    public void carpmaTest() {
        double carpmaSonuc = hesapMakinesi.carpma(3.1,2.0);
        Assertions.assertEquals(6.2,carpmaSonuc);
    }

    @Test
    public void bolmeTest() {
        double bolmeSonuc = hesapMakinesi.bolme(6.2,3.1);
        Assertions.assertEquals(2.0,bolmeSonuc);
    }

    @AfterEach
    public void teardown() { // after methodlar genelde tearDown yani kapama ismiyle yazilir
        System.out.println("teardown method calisti");
    }

    @AfterAll
    public static void teardownClass() { // All method oldugu icin static tanimladik
        System.out.println(" AfterAll teardown class method calisti");
    }

    // breakpoint: debug etmek icin breakpoint koyariz ve debug modda calistirdiktan sonra bizim isaretledigimiz
    // breakpointte uygulama durur ve debug islemi yaparak manual ilerletip hatayi bulmaya calisiriz
    // step over -> bir sonraki kod satirina gider
    // step into -> satirdaki methodun icine gider
}
