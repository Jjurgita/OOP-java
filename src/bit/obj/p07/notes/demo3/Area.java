package bit.obj.p07.notes.demo3;

public class Area {

    private Area() {
    }

    public static double circle(double r) {
        return Math.PI * r * r;
    }

    public static double triangle(double a, double b, double c) {
        double s = (a + b + c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double square(double r) {
        return r * r;
    }
}
