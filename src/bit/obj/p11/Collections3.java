package bit.obj.p11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collections3 {
    /*
                COLLECTIONS - Map (žodynas)
     */
    public static void main(String[] args) {

        /*
            Map - tai sąsaja, kuri aprašo kaip turi veikti kolekciją tipo “raktas-reikšmė” (key-value pairs).

            Kaip ir aibės yra paprastas ir lygiuotas variantai raktų atžvilgiu.
            Paprastą Map sąsają realizuoja HashMap, o lygiuotą TreeMap. Yra ir daugiau realizacijų.
         */

        System.out.println("HashMap:");
        testMap(new HashMap<>());

        System.out.println("--------------------");

        System.out.println("TreeMap:");
        testMap(new TreeMap<>());
    }

    private static void testMap(Map<String, Integer> map) {

        map.put("trisdešimt", 30);
        map.put("dvidešimt", 20);
        map.put("penkiasdešimt", 50);
        map.put("dvidešimt", 20);
        map.put("šeši", 6);
        map.put("septyniasdešimt", 70);


        System.out.print("Žodyno reikšmės:");
        for (Integer i : map.values()) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.print("Žodyno raktai:");
        for (String i : map.keySet()) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("Ar yra reikšmė 20? = " + map.containsValue(20));
        System.out.println("Ar yra raktas 'dešimt'? = " + map.containsKey("dešimt"));

        System.out.println("Išmetam objektą su raktu 'dešimt'");
        map.remove("dešimt");

        System.out.print("Žodyno reikšmės:");
        for (Integer i : map.values()) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.print("Žodyno raktai:");
        for (String i : map.keySet()) {
            System.out.print(" " + i);
        }
        System.out.println();

    }
}
