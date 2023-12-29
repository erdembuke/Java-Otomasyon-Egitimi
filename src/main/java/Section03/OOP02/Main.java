package Section03.OOP02;

public class Main {
    public static void main(String[] args) {
        Lamba salonLed = new Lamba("Living Room");
        salonLed.lambaDurumu();
        salonLed.status = true;
        salonLed.lambaDurumu();

        Lamba yatakLed = new Lamba("Bedroom");
        yatakLed.lambaDurumu();
        yatakLed.status = true;
        yatakLed.lambaDurumu();





    }
}
