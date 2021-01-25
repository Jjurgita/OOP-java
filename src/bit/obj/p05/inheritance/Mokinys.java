package bit.obj.p05.inheritance;

public class Mokinys extends BendraInfo {

    //papildomi klases laukai:
    private int klase;

    public Mokinys() {
        System.out.println("Mokinys()");
    }

    public int getKlase() {
        return klase;
    }

    public void setKlase(int klase) {
        this.klase = klase;
    }

    public String adresas() {
        return this.adresas.toString();
    }
}
