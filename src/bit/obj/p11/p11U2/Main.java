package bit.obj.p11.p11U2;

import java.util.*;

public class Main {
    /*
            Klasės darbas su Set
            UŽDUOTIS:
                - perrasyti Address su TreeSet
     */
    public static void main(String[] args) {
        System.out.print("TreeSet: ");
        container(new TreeSet<>());

        System.out.print("HashSet: ");
        container(new HashSet<>());

        System.out.print("LinkedList: ");
        container(new LinkedList<>());

        System.out.print("ArrayList: ");
        List<String> miestai = new ArrayList<>();
        container(miestai);

        Collections.sort(miestai);
        System.out.println(miestai.size() + " " + miestai);

        // Set'ai su mano klase Address
        Set<Address> adresas1 = new HashSet<>();
        adresas1.add(new Address("Babtai", "Lapu aleja 12"));
        adresas1.add(new Address("Vilnius", "Gedimino 1"));
        adresas1.add(new Address("Babtai", "Lapu aleja 12"));

        Address babtai = new Address("Babtai", "Lapu aleja 12");
        adresas1.add(babtai);
        adresas1.add(babtai);

        System.out.println("adresas1=" + adresas1.size() + " " + adresas1);

        Address a1 = new Address("Babtai", "Lapu aleja 12");
        Address a2 = new Address("Babtai", "Lapu aleja 12");
        System.out.println("a1 == a2 ? " + (a1 == a2));
        System.out.println("a1.equals(a2) ? " + a1.equals(a2));

    }


    static void container(Collection<String> miestai) {

        miestai.add("Babtai");
        miestai.add("Vilnius");
        miestai.add("Babtai");
        miestai.add("Kaunas");

        System.out.println(miestai.size() + " " + miestai);

    }


}
