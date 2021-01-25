package bit.obj.p06.notes;

public class Zmogus {
    // KLASES METODAI

    // Klases gali tureti ne tik laukus, bet ir metodus(funkcijas), kurios atliekas veiksmus su objekto laukais

    // Klases metodai gali grazinti reiksme (tipas nurodomas pries metodo varda)
    // Metogai gali ir nieko negrazinti, tada rasome void pries metodo varda

    // Metodai gali netureti arba tureti ivairiu parametru - juos israsome skliausteliuose nurodant parametro tipa

    String vardas;
    String pavarde;

    Zmogus (String vardas) {
        this.vardas = vardas;
    }

    Zmogus (String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    String pilnasVardas() {
        return vardas + (pavarde == null ? "" : (" " + pavarde));
    }

    String pilnasVardas(String titulas) {
        return (titulas == null ? "" : titulas + " ") + pilnasVardas();
    }

    public static void main(String[] args) {
        Zmogus zmogus1 = new Zmogus("Kasparas XV");
        System.out.println(zmogus1.pilnasVardas("Jo didenybe"));

        Zmogus zmogus2 = new Zmogus("Ona", "Onaite");
        System.out.println(zmogus2.pilnasVardas());
    }
}
