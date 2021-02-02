package bit.obj.p11;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    /*
        Java kolekcijos - tai klasės - konteineriai, kuriuose galima laikyti keletą elementų.
        (Kažkas panašaus kaip masyvas, tik elementų skaičius tame konteineryje gali keisti.)

        COLLECTIONS FRAMEWORK
        Tai yra interface, class ir static funkcijų rinkinys.
            (interface - tai abstraktūs duomenų tipai vaizduojantys įvairias kolekcijas (sąrašas, eilė, stekas, žodynas, ...);
            (klasės - tai kolekcijų sąsajų įvairios realizacijos (implementations);
            (funkcijos - realizuojančios įvairius universalius algoritmus, kaip kad rūšiavimo, paieškos ir pan);

        COLLECTIONS tipai:
         - List
         - Set
         - Map
         - Quaue
         - Deque

         Kai aprašome kolekciją, tai reikia nurodyti jos tipą ir taip pat kokio tipo (klasės) bus jos elementai (o taip pat ir kokia raktų klasė jei tai Map kolekcija):
                 List<Integer>a;
                 Map<String,Zmogus>zmogus;

         Kai kolekciją kuriam, tai tipus nurodyti nėra privaloma, nes java kompiliatorius pats supranta, kokie tipai turi būti, pagal tai, koks kintamojo arba parametro tipas. Todėl užtenka nurodyti tik <>
                 List<Integer> a = new ArrayList<>();
                 Map<String, Zmogus> zmones = new HashMap<>();
     */
    public static void main(String[] args) {

        /*
                COLLECTIONS - List
         */

        List<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(20);
        list.add(0, 40);

        //Elementus sąraše galima pasiekti einant nuo sąrašo pradžios iki galo
        System.out.print("Sąrašas:");
        for (Integer a : list) {
            System.out.print(" " + a);
        }
        System.out.println();

        System.out.println("Ar yra 20? = " + list.contains(20));//Galima patikrinti ar sąraše nėra tam tikro elemento
        System.out.println("20 indeksas yra: " + list.indexOf(20));//Elementus sąraše galima pasiekti pagal jų eilės numeri
        System.out.println("(1) = " + list.get(1));

        //Elementai sąraše turi tam tikras vietas (panašiai kaip masyve), kurios nesikeičia be mūsų įsikišimo
        System.out.println("Išmetam is sąrašo (0) ir 20");
        list.remove(0);
        list.remove(Integer.valueOf(20));

        System.out.print("Sąrašas:");
        for (Integer i : list) {
            System.out.print(" " + i);
        }
        System.out.println();


        List<Integer> b = new ArrayList<>();
        b.add(25);
        b.add(26);

        list.addAll(b);

        System.out.print("Sąrašas:");
        for (Integer i : list) {
            System.out.print(" " + i);
        }
        System.out.println();

        b.clear();
        b.add(10);
        b.add(20);
        System.out.println("Ar yra 10,20? = " + list.containsAll(b));

        b.add(21);
        System.out.println("Ar yra 10,20,21? = " + list.containsAll(b));
    }
}
