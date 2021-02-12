package bit.obj.p18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Visada galime išplėsti paveldėtą klasę, tačiau jos susiaurinti negalime
public class PaveldimumasDemo {
    public static void main(String[] args) {
        try {
            List<Integer> numbers = new ManoList<>();
            numbers.add(10);
            numbers.add(25);
            numbers.add(99);

            numbers.remove(1);
            System.out.println(numbers);
        } catch (ManoException e) {
            e.printStackTrace();
        }

        //
        ManoKitasList<Integer> numbers2 = new ManoKitasList<>();
        numbers2.add(10);
        numbers2.add(25);
        numbers2.add(99);

        // numbers2.remove(2);
        System.out.println(numbers2);

        for (Integer i : numbers2) {
            System.out.print(" " + i);
        }
    }

    static class ManoList<T> extends ArrayList<T> {

        @Override
        public T remove(int index) {
            // return null;
            throw new ManoException("Negalima nieko naikinti");
        }
    }

    static class ManoException extends RuntimeException {
        //konstruktorių iš tėvinės class vaikai nepaveldi
        public ManoException(String message) {
            super(message);
        }
    }


    static class ManoKitasList<T> implements Iterable<T> {
        //jeigu class viduje sukuriame naują objektą ArrayList ir čia nurodome kokius metodus jis turi, automatiškai yra vykdomi tik esantys metodai, t.y. remove() net neleis vykdyti
        private ArrayList<T> listas = new ArrayList<>();
        private String name;

        public ManoKitasList() {
        }

        public ManoKitasList(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void add(T element) {
            listas.add(element);
        }

        @Override
        public String toString() {
            return listas.toString();
        }

        @Override
        public Iterator<T> iterator() {
            return listas.iterator();
        }

        public int size() {
            return listas.size();
        }
    }
}
