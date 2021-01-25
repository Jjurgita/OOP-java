package bit.obj.p05;

public class Mokinys {
    //jeigu Mokinys class file butu kitame package reikru prie Sring, int ir Mokinys konstruktoriaus prideti "public"
    String firstname; // pagal nutylejima bus = null
    String lastname; // = null
    int level; // = 0

    //metodas-konstruktorius: Java kalboj yra toks pats kaip class name
//    Mokinys(String n, int l) {
//        name = n;
//        level = l;
//    }

    //jeigu norime kintamuosius vadinti taip pat reikia prideti "this"
    Mokinys (String firstname, String lastname, int level) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.level = level;
    }
    Mokinys (String firstname) {
        this.firstname = firstname;
    }

}
