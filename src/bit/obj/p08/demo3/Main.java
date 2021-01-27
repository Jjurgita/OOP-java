package bit.obj.p08.demo3;

import bit.obj.p08.demo1.Ellipse;
import bit.obj.p08.demo1.Figure;
import bit.obj.p08.demo1.Circle;

public class Main {
    public static void main(String[] args) {

        //Circle figure1 = new Circle("green", 14);       // 14 * 14 = 2*7 * 2*7
        //Ellipse figure2 = new Ellipse("green", 4, 49);

        System.out.println(isSameArea(
                new Circle("green", 20),
                new Ellipse("green", 8, 24.5)
        ) ? "lygu" : "nelygu");

    }

    static boolean isSameArea(Figure e1, Figure e2) {
        return e1.getArea() == e2.getArea();
    }
}
