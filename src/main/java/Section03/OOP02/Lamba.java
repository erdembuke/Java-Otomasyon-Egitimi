package Section03.OOP02;

public class Lamba {
    public boolean status = false;
    private String location;

    // Constructor attribute' lardan sonra , methodlardan once yazilir
    public Lamba(String _location) {
        location = _location;
        System.out.println("lamba konumu : " + location);
    }

    public void lambaDurumu() {
        if (status) {
            System.out.println(location + " Lamba Acik");
        }else
            System.out.println(location + " Lamba Kapali");
    }


}
