package bit.obj.p09.color;
/*
Sukurti interface Color ir kelias klases implementuojancias ta interface;
Sugalvoti klase Container, kuri implementuoja IContainer (interface)
  t.y. i kurios objekta galima prideti kiek nori objektu su Color interface;


 */

public class Main {
    public static void main(String[] args) {
        int color = 100;
        IContainer container = new Container();
        container.add(new A(color++));
        container.add(new A(color++));
        container.add(new B(color++));
        container.add(new B(color++));
        container.add(new A(color++));
        container.add(new A(color++));

        System.out.println("size = " + container.size());

        for (int i = 0; i < container.size(); i++) {
            Color c = container.get(i);
            System.out.println(c.getColor());
        }
    }
}
