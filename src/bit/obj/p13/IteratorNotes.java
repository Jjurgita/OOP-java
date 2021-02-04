package bit.obj.p13;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;
    /*
            Kolekcijos (ir bet kokios klasės), kurių elementus galima ištraukti vieną po kito tam tikra tvarka, turi realizuoti Iterable<Type> sąsają.
            Ši interfeisas reikalauja realizuoti tik vieną metodą iterator(), kuris turi grąžinti iteratoriaus objektą, t.y. objektą, kuris realiziuoja sąsają Iterator<Type>.

            Iterator interfeisas reikalauja realizuoti šiuos metodus:
                    boolean hasNext();
                    Type next();
                    void remove();
                    Note: metodą remove() neprivalu realizuoti, jei kolekcija nepalaiko bet kokio elemento naikinimo
     */

public class IteratorNotes {
    public static void main(String[] args) {

        Collection<String> set = new TreeSet<>();
        set.add("Kaunas");
        set.add("Vilnius");
        set.add("Kaunas");
        set.add("Alytus");
        set.add("Klaipėda");
        set.add("Vilnius");
        set.add("Kaunas");

        //  STANDARTINIS CIKLAS naudojant ITERATORIŲ:
            //Ciklo metu negalima trinti ar prideti elementų į iteruojamą kolekciją

        Iterator<String> iterator = set.iterator();
        //while ciklas:
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        //for ciklas:
        for (String s : set) {
            String s1 = iterator.next();
            System.out.println(s1);
        }

    }
}
