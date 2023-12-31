package Section04.StaticUsage;

public class Araba {
    private String brand;
    public static int carPrice = 750000;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
