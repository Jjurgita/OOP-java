package bit.obj.p13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorNotes2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Kaunas");
        list.add("Vilnius");
        list.add("Kaunas");
        list.add("Alytus");
        list.add("Klaipėda");
        list.add("Vilnius");
        list.add("Kaunas");

        Iterator<String> iterator = list.iterator();
        //while ciklas:
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("Vilnius")) {
                // Jei ciklo metu norime trinti elementus tai reikia tiesiogiai naudoti iteratorių:
                iterator.remove();
            }
        }
        //for ciklas:
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals("Vilnius")) {
//                list.remove(i);
//            }
//        }

        System.out.println(list);
    }

}
