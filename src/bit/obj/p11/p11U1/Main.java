package bit.obj.p11.p11U1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    /*
        Sukurkite žodyno tipo kolekciją saugoti žmonių klasės objektus (su tokiais laukais: vardas, pavardė, asmens kodas), o kaip raktą naudokite asmens kodą.
        Įdėkite keletą žmonių į kolekciją ir atspausdinkite žmones asmens kodo didėjimo tvarka.
        Pabandykite įdėti į kolekciją du skirtingus žmones bet su tuo pačiu asmens kodu. Patikrinkite kas atsitiks?
        Pagalvokite kaip saugoti žmones jei norime turėti kelis su tuo pačiu asmens kodu.
     */
    /*
        Kaip ir aibė(Set), Map gali būti Lygiuota - TreeMap (key atžvilgiu)
        Lygiuota - kai elementai išrikiuojami sąraše pagal jų palyginimus (naudojamas compareTo metodas)
     */
    public static void main(String[] args) {
        //Iškviečiam sukurta/as Map collection
        System.out.println("*** First simple TreeMap collection - 1 Uždavinio dalis ***");
        firstMap(new TreeMap<>());

        System.out.println("*** TreeMap collection w/ List - 2 Uždavinio dalis ***");
        secondMap(new TreeMap<>());

    }

    //1) Sukuriam map collection:
    static void firstMap(Map<String, Person> persons) {

        //2) Įdedam naujai konstruojamus Person objektus:
        //konstruojant new Persin atskirai:
        Person p1 = new Person("A", "A", "00000000000");
        persons.put(p1.getPersonID(), p1);
        //iškart rašant į vieną eilutę:
        persons.put("11111111111", new Person("J", "J", "11111111111"));
        persons.put("22222222222", new Person("P", "P", "22222222222"));
        persons.put("33333333333", new Person("K", "K", "33333333333"));
        persons.put("44444444444", new Person("L", "L", "44444444444"));
        persons.put("44444444444", new Person("S", "S", "44444444444"));

        //3) Spausdinam collection esančius objektus:
        for (Person i : persons.values()) {
            System.out.println(" " + i);
        }
    }

    //4) Jeigu į kolekciją įdedam du skirtingus žmones su tuo pačiu asmens kodu (key), įdedama nauja reikšmė, o sena digsta..
    //kaip sutvarkyti, kad abi to paties key value būtų atspausdinta?
    //5) Sukuriame kelis Map, tik šįkart naudoti List<Person> listą; apsirašant dar viena metoda tam, kad galėtume įdėti new Person į List
    static void secondMap(Map<String, List<Person>> persons) {
        Person p1 = new Person("A", "A", "00000000000");
        addSecondMap(persons, p1);

        addSecondMap(persons, new Person("J", "J", "11111111111"));
        addSecondMap(persons, new Person("P", "P", "22222222222"));
        addSecondMap(persons, new Person("K", "K", "33333333333"));
        addSecondMap(persons, new Person("L", "L", "44444444444"));
        addSecondMap(persons, new Person("S", "S", "44444444444"));

        for(List<Person> personsList : persons.values()){
//            System.out.println(personsList.size()); atspausdina kiek yra vienodu key
            for(Person p : personsList){
                System.out.println(" " + p);
            }
        }
    }

    static void addSecondMap(Map<String, List<Person>> persons, Person p) {
        //Norint, kad Map būtų visos key reikšmės:
        //1) randu sukurto person (p) key (personID) ir priskiriu kintamajam pID
        String pID = p.getPersonID();
        //2) pasitikrinam ar su tokiu key person jau yra?
        if(!persons.containsKey(pID)){//klausiam, ar dar nėra?
            //jeigu nėra, sukuriam Listą<Person>, į jį įdedam sukurta person (p) ir tuomet Listą į Map
            List<Person> pWithID = new ArrayList<>();
            pWithID.add(p);
            persons.put(pID, pWithID);//įdedam į Map
        } else {
            //jeigu jau yra, reikškias Listas jau yra sukurtas
            List<Person> pWithID = persons.get(pID);//duok List zmogaus su tuo ID
            pWithID.add(p);//ta person įdedam į Lista
        }
    }
}
