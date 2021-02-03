package bit.obj.p11.p11U2.notes_Set;

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
        Collections.sort(miestai);//sort galima tik listą
        System.out.println(miestai.size() + " " + miestai);
        System.out.println("------------------------------");

        // Set'ai su class Address (HashSet)
        Set<Address> adresas1 = new HashSet<>();
        adresas1.add(new Address(1,"Babtai", "Lapu aleja 12"));
        adresas1.add(new Address(2,"Vilnius", "Gedimino 1"));
        adresas1.add(new Address(1,"Babtai", "Lapu aleja 12"));

        Address babtai = new Address(1,"Babtai", "Lapu aleja 12");
        adresas1.add(babtai);
        adresas1.add(babtai);

        System.out.println("adresas1=" + adresas1.size() + " " + adresas1);

        Address a1 = new Address(1, "Babtai", "Lapu aleja 12");
        Address a2 = new Address(1, "Babtai", "Lapu aleja 12");
        System.out.println("a1 == a2 ? " + (a1 == a2));//rasyt false, a1 ir a2 yra atskiri, nors reikšmės ir tos pačios
        System.out.println("a1.equals(a2) ? " + a1.equals(a2));//norit palyginti reiksmes reikia naudoti Overridintą Object class equals metodą
        System.out.println("---------------------------------");


        //TreeSet
        //Tam, kad galėtume naudoti TreeSet, reikia implementuoti Comparable interface savo Address class
        Set<Address> addresses = new TreeSet<Address>();
        addresses.add(new Address(1, "Babtai", "Lapu aleja 12"));
        addresses.add(new Address(3, "Vilnius", "Gedimino 1"));
        addresses.add(new Address(1, "Babtai", "Lapu aleja 12"));
        addresses.add(new Address(2, "Kaunas", "Lapu aleja 12"));

        System.out.println("addresses = " + addresses.size() + " " + addresses);
    }

    static void container(Collection<String> miestai) {

        miestai.add("Babtai");
        miestai.add("Vilnius");
        miestai.add("Babtai");
        miestai.add("Kaunas");

        System.out.println(miestai.size() + " " + miestai);
    }

}
