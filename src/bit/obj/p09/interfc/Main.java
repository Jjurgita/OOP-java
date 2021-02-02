package bit.obj.p09.interfc;
/*
Sukurti interface Color ir kelias klases implementuojancias ta interface;
Sugalvoti klase Container, kuri implementuoja IContainer (interface)
  t.y. i kurios objekta galima prideti kiek nori objektu su Color interface;
 */
public class Main {
    public static void main(String[] args) {

        IContainer container = new Container();
        container.add(new A(111));
        container.add(new A(222));
        container.add(new B(333));
        container.add(new B(444));
        container.add(new A(555));
        container.add(new A(666));
        container.add(new A(777));
        container.add(new A(888));
        container.add(new A(999));
        container.add(new A(111));
        container.add(new A(222));
        container.add(new B(333));
        container.add(new B(444));
        container.add(new A(555));
        container.add(new A(666));
        container.add(new A(777));
        container.add(new A(888));
        container.add(new A(999));

        System.out.println("size = " + container.size());

        for (int i = 0; i < container.size(); i++) {
            Color c = container.get(i);
            System.out.println(c.getColor());
        }
    }
}
