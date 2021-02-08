package bit.obj.p15;
/*
        LAMBDA - patogesnis būdas išrašyti anonominių klasių objekto kūrimo išraišką

        Lambda išraiška atitinka interfeisą, kai:
        - Interfeisas turi tik vieną abstraktų metodą;
        - Lambda išraiškos parametrų skaičius atitinka interfeiso metodo parametrus;
        - Lambda rezultato tipas atitinka interfeiso metodo rezultato tipą;

        Galima žymėti (anotuoti) @FunctionalInterface

        Lambda išraišką galima naudoti ne tik kaip parametrą, bet ir kaip kintamojo, kurio tipas yra funkcinis interfeisas, reikšmę.
        Tokį kintamąjį galima naudoti kaip parametrą arba interfeise nurodytą metodą kviesti tiesiogiai. (demo2 package)

        Lambda išraiška gali naudoti visus kintamuosius, kurie yra prieinami išraiškos vietoje (taip ir this bei super).
        Visi panaudoti lokalūs kintamieji turi būti pažymėti final ar tokie būti pagal kontekstą, t.y. jo reikšmė po priskyrimo neturi būti keičiama. (demo3 package)

        Objekto (instance) laukai gali būti naudojami ir modifikuojami be jokių apribojimų. (demo4 package)

        Nors funkciniame interfeise galima turėti default metodus bet juos naudoti lambda išraiškoje NEGALIMA. (demo5 package)

        Jei klasėje turime apsirašę statinį (!!!) metodą, tai jį galima priskirti lambda objektui naudodami užrašą: klasė::metodas
        Priskirti metodą galima tik tada jei pilnai sutampa parametrai ir rezultato tipas. (demo6 package)

        Galima priskirti konstruktorių: klasė::new (demo7 package)

        Taip pat galime priskirti ne tik statinį metodą, bet ir objekto (instance) metodą: objektas::metodas  (demo9 package)
 */


import bit.obj.p15.data.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
/*
        Tarkime turime sąrašą darbuotojų ir norime atrinkti tik tuos, kurių atlyginimas didesnis negu x, kaip galima padaryti?
            - fiksuotas ciklas
            - inteface kaip filtras
            - lambda išraiška

 */
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Kazys", 1400.0, "administration"));
        list.add(new Employee("Jonas", 800.0, "store"));
        list.add(new Employee("Ona", 900.0, "sales"));
        list.add(new Employee("Petras", 1200.0, "sales"));
        list.add(new Employee("Ada", 1500.0, "administration"));

        // atspausdinti tuos kurie uzdirba daugiau nei 900
        System.out.println("visi >900:");
        filter(list, 900.0);

        // atspausdinti tuos kurie uzdirba daugiau nei 900
        // ir dirba administracijoje
        System.out.println(">900 is administracijos:");
        Predicate<Employee> filter = new Predicate<Employee>() {
            @Override
            public boolean test(Employee e) {
                return e.getSalary() > 900 &&
                        e.getDepartment().equals("administration");
            }
        };
        filterByFilter(list, filter);

        // atspausdinti tuos kurie uzdirba daugiau nei 900
        // ir dirba ne administracijoje
        System.out.println(">900 is ne administracijos:");
        //Predicate<Employee> filter2 = e ->
        //        e.getSalary() > 900 &&
        //                !e.getDepartment().equals("administration");
        //filterByFilter(list, filter2);
        filterByFilter(list, x -> x.getSalary() > 900 &&
                !x.getDepartment().equals("administration"));

        System.out.println("Pagal atlyginimo mazejima:");
        list.sort((o1, o2) -> {
            //if (o1.getSalary() < o2.getSalary()) return 1;
            //if (o1.getSalary() > o2.getSalary()) return -1;
            //return 0;
            return -Double.compare(o1.getSalary(), o2.getSalary());
        });
        for (Employee e : list) {
            System.out.println(e);
        }

        // Surusiuojame pagal skyrius ir pagal vardus:
        Collections.sort(list, (a, b) -> {
            int comp = a.getDepartment().compareTo(b.getDepartment());
            if (comp != 0) return comp;
            comp = a.getName().compareTo(b.getName());
            return comp;
        });
        System.out.println(list);
    }

    public static void filter(List<Employee> list, double salary) {
        for (Employee e : list) {
            if (e.getSalary() > salary) {
                System.out.println(e);
            }
        }
    }

    public static void filterByFilter(List<Employee> list, Predicate<Employee> filter) {
        for (Employee e : list) {
            if (filter.test(e)) {
                System.out.println(e);
            }
        }
    }
}
