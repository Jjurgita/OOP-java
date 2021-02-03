package bit.obj.p11.p11U2;

import bit.obj.p11.p11U1.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
        Sukurti class Address ir naudojant Collections atspausdinti objektų sąrašą
        pvz.: kiek ir kokių adresų yra Vilniuje, Kaune ir t.t.
 */
public class Main {
    public static void main(String[] args) {
        setMap(new TreeMap<>());
    }

    static void setMap(Map<String, List<Address>> addresses) {
        addMapList(addresses, new Address("Vilnius", "Vilniaus g.", "13"));
        addMapList(addresses, new Address("Vilnius", "Liepų g.", "1"));
        addMapList(addresses, new Address("Vilnius", "Kauno g.", "87"));
        addMapList(addresses, new Address("Vilnius", "Sodų g.", "130"));
        addMapList(addresses, new Address("Klaipėda", "Palangos g.", "3"));
        addMapList(addresses, new Address("Klaipėda", "Radvilų g.", "5"));
        addMapList(addresses, new Address("Kaunas", "Jurbarko g.", "57"));
        addMapList(addresses, new Address("Kaunas", "Kauno g.", "10"));
        addMapList(addresses, new Address("Kaunas", "Sodų g.", "100"));
        addMapList(addresses, new Address("Kaunas", "Liepų g.", "1"));
        addMapList(addresses, new Address("Kaunas", "Palangos g.", "88"));
        addMapList(addresses, new Address("Kaunas", "Vilniaus g.", "54"));

        System.out.println("----------------------------");
        for(List<Address> addressList : addresses.values()){
            System.out.println(addressList.size() + " addresses:");
            for(Address a : addressList){
                System.out.println(" " + a);
            }
            System.out.println("----------------------------");
        }
    }

    static void addMapList(Map<String, List<Address>> addresses, Address a) {
        String aKey = a.getCity();
        if (!addresses.containsKey(aKey)) {
            List<Address> aWithKey = new ArrayList<>();
            aWithKey.add(a);
            addresses.put(aKey, aWithKey);
        } else {
            List<Address> aWithKey = addresses.get(aKey);
            aWithKey.add(a);
        }
    }

}
