package Section03.OOP03.Interface;

public class GirisSayfasi implements Sayfa, Menu {

    @Override
    public void tusaBas() {
        System.out.println("tusa basildi");
    }

    @Override
    public void elementBul() {
        System.out.println("element bulundu");
    }


    @Override
    public void widget() {

    }
}
