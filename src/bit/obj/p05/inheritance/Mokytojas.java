package bit.obj.p05.inheritance;

public class Mokytojas extends BendraInfo {

    //papildomi kalses laukai
    private String dalykas;
    private int kabinetas;


    public Mokytojas() {
        System.out.println("Mokytojas()");
    }

    public String getDalykas() {
        return dalykas;
    }

    public void setDalykas(String dalykas) {
        this.dalykas = dalykas;
    }

    public int getKabinetas() {
        return kabinetas;
    }

    public void setKabinetas(int kabinetas) {
        this.kabinetas = kabinetas;
    }
}
