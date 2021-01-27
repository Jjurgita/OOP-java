package bit.obj.p07.notes.demo1;

public class People {
    private static int kiekis = 0;
    private String vardas;
    private String pavarde;

    public People(String vardas) {
        this.vardas = vardas;
        kiekis++;
    }

    public static int getKiekis() {
        return kiekis;
    }

    public String pilnasVardas() {
        return vardas + (pavarde == null ? "" : ' ' + pavarde);
    }
}
