package bit.obj.p09.color;

public class Main {
    public static void main(String[] args) {

        IContainer container = new Container();
        container.add(new Sun("yellow"));
        container.add(new Sun("red"));
        container.add(new Sun("white"));
        container.add(new Moon("white"));
        container.add(new Moon("black"));
        container.add(new Moon("red"));

//        for(Container c : container) {
//            Color color = container.get(c);
//            System.out.println(color.getColor());
//        }


    }
}
