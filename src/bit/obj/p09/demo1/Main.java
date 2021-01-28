package bit.obj.p09.demo1;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.setSizeFromArea(100);
        System.out.println("Circle radius: " + c.getRadius());

        Area a = c;
        printArea(c);
    }
    static void printArea(Area a) {
        System.out.println("Area = " + a.getArea());
    }
}
