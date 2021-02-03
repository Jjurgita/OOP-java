package bit.obj.p11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collections2 {

    /*
                COLLECTIONS - Set (aibė)
     */

    public static void main(String[] args) {

        /*
            Set - tai aibę (arba nesikartojantį sąrašą) ir darbą su juo aprašanti sąsaja.
            Nuo list skiriamsi tuo, kad reiksmes negali kartotis;

            Aibė yra 2 rūšių:
                    Paprasta - kada mes nežinome ir mums nerūpi elementų išsidėstymo tvarka - nesvarbus rūšiavimas;
                    Lygiuota - kai elementai išrikiuojami sąraše pagal jų palyginimus (compareTo metodas) - svarbus rūšiavimas;

            Paprastą aibės sąsają realizuoja HashSet, o lygiuotą TreeSet. Yra ir daugiau realizacijų..
            Dažniausiai naudojami HashSet


         */

        System.out.println("HashSet:");//paprasta aibė
        testSet(new HashSet<>());

        System.out.println("--------------------");

        System.out.println("TreeSet:");//lygiuota aibė
        testSet(new TreeSet<>());
    }

    private static void testSet(Set<Integer> set) {

        set.add(30);
        set.add(20);
        set.add(50);
        set.add(20);
        set.add(10);

        System.out.print("Aibės dydis " + set.size() + ": " );
        for (Integer i : set) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("Ar yra 20? = " + set.contains(20));

        System.out.println("Išmetam is sąrašo 20");
        set.remove(20);

        System.out.print("Aibės dydis " + set.size() + ": " );
        for (Integer i : set) {
            System.out.print(" " + i);
        }
        System.out.println();

    }
}
