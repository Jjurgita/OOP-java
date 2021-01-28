package bit.obj.p09.demo2;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.setBorder(true);
        c.setColor("blue");
        c.setSizeFromArea(100);

        System.out.println("Figure color - " + c.getColor() + "\nWith border? - " + c.hasBorder());
    }
}
