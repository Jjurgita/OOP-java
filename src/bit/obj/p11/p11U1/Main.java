package bit.obj.p11.p11U1;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    /*
        Sukurkite žodyno tipo kolekciją saugoti žmonių klasės objektus (su tokiais laukais: vardas, pavardė, asmens kodas), o kaip raktą naudokite asmens kodą.
        Įdėkite keletą žmonių į kolekciją ir atspausdinkite žmones asmens kodo didėjimo tvarka.
        Pabandykite įdėti į kolekciją du skirtingus žmones bet su tuo pačiu asmens kodu. Patikrinkite kas atsitiks?
        Pagalvokite kaip saugoti žmones jei norime turėti kelis su tuo pačiu asmens kodu.
     */
    public static void main(String[] args) {

        //Kaip ir aibė(Set) Map yra Lygiuota (key atžvilgiu) - TreeMap
        //Lygiuota - kai elementai išrikiuojami sąraše pagal jų palyginimus (compareTo metodas);

        //1) Sukuriam map collection:
        Map<BigInteger, Person> persons = new TreeMap<>();

        //2) Įdedam naujai konstruojamus Person objektus:
        persons.put(new BigInteger("39901010101"), new Person("J", "J", new BigInteger("39901010101")));
        persons.put(new BigInteger("49901010101"), new Person("P", "P", new BigInteger("49901010101")));
        persons.put(new BigInteger("39901010102"), new Person("K", "K", new BigInteger("39901010102")));
        persons.put(new BigInteger("39901010103"), new Person("L", "L", new BigInteger("39901010103")));
        persons.put(new BigInteger("39901010103"), new Person("S", "S", new BigInteger("39901010103")));

        //3) Spausdinam collection esančius objektus:
        for (Person i : persons.values()) {
            System.out.println(" " + i);
        }

        //jeigu į kolekciją įdedam du skirtingus žmones su tuo pačiu asmens kodu - ima paskutini ir uzraso ji ant virsaus - negerai :/
        //kaip tai pataisyti?


    }
}
