package bit.obj.p13.collection_features;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
        Kolekcijų karkasas (framework) susideda ne tik iš interfeisų ir klasių, bet ir iš funkcijų - java.util.Collections klasės statinių metodų.
        Labai daug visokių metodų darbui su kolekcijomis: lygiavimas, paieška, max ar min elementų paieška ir t.t.
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        //Collection<Employee> list = new TreeSet<>();
        //Collection<Employee> list = new HashSet<>();

        list.add(new Employee(1, "Ona", "administracija", new BigDecimal("11.00")));
        list.add(new Employee(2, "Zenonas", "pardavimai", new BigDecimal("9.00")));
        list.add(new Employee(3, "Audra", "administracija", new BigDecimal("10.00")));
        list.add(new Employee(4, "Ignas", "administracija", new BigDecimal("12.00")));
        list.add(new Employee(5, "Jonas", "pardavimai", new BigDecimal("9.00")));
        list.add(new Employee(6, "Petras", "pardavimai", new BigDecimal("7.00")));
        list.add(new Employee(7, "Antanas", "apskaita", new BigDecimal("12.00")));
        list.add(new Employee(8, "Rasa", "administracija", new BigDecimal("12.00")));
        list.add(new Employee(9, "Ona", "pardavimai", new BigDecimal("10.00")));
        list.add(new Employee(1, "Ona", "administracija", new BigDecimal("9.00")));
        list.add(new Employee(1, "Ona", "pardavimai", new BigDecimal("9.00")));
        list.add(new Employee(1, "Ana", "pardavimai", new BigDecimal("9.00")));

        for (Employee employee : list) {
            System.out.println(employee);
        }

        System.out.println("----------------------");
        System.out.println("Sulygiuota:");
        Collections.sort(list);
        for (Employee employee : list) {
            System.out.println(employee);
        }

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int comp = o1.getDep().compareTo(o2.getDep());
                if (comp == 0) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return comp;
                }
            }
        });

        System.out.println("----------------------");
        System.out.println("Sulygiuota pagal skyrius-vardas:");
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
