package bit.obj.p14.generics;

import java.util.Date;

/*
    Uzduotis kaip Color is p09:
    + prideti kokio nori tipo objektus nekuriant nauju klausiu (naudoti generics);
    Tam, kad pridetum tam tikro tipo objektus, kiekvienam tipui reikia sukurti container atskirai.
    Jeigu naudojam generics class container to daryti nereikia:
 */
public class Main {
    public static void main(String[] args) {

        // Container kiekvienam tipui atskirai:
        // int tipo objektai:
        IContainer container = new Container();
        container.add(new A(111));
        container.add(new B(222));
        container.add(new A(333));

        System.out.println("size = " + container.size());

        for (int i = 0; i < container.size(); i++) {
            Color c = container.get(i);
            System.out.println(c.getColor());
        }

        // String:
        IContainerString container2 = new ContainerString();
        container2.add("A1");
        container2.add("A2");
        container2.add("A3");

        System.out.println("size = " + container2.size());
        for (int i = 0; i < container2.size(); i++) {
            String c = container2.get(i);
            System.out.println(c);
        }

        // Object:
        IContainerObject container3 = new ContainerObject();
        container3.add(new Date());
        container3.add("Kuku");
        container3.add(null);
        container3.add(new A(123));

        System.out.println("size = " + container3.size());
        for (int i = 0; i < container3.size(); i++) {
            Object c = container3.get(i);
            System.out.println(c);
        }

        // Generic Containers

        //<> nurodomas kuriamo objekto tipas - siuo atveju date
        //kito tipo objektai nebus pridedami (add)
        IContainerGen<Date> container4 = new ContainerGet<Date>();
        container4.add(new Date());
        container4.add(new Date());
//        container4.add("Tekstas");

        //String tipo:
        IContainerGen<String> container5 = new ContainerGet<>();
        container5.add("A1");
        container5.add("A2");

        //Galima uzrasyti ivairiai - visi trys reiskia ta pati:
        //1) rasyti nerekomenduojama del stilistikos
        IContainerGen container61 = new ContainerGet();
        IContainerGen<Object> container62 = new ContainerGet<>();
        IContainerGen<?> container63 = new ContainerGet<>();



    }
}
