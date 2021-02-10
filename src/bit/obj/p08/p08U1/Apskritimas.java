package bit.obj.p08.p08U1;

public class Apskritimas extends Figura {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getParameter() {
        return 2 * Math.PI * radius;
    }

    public double parametersIfAreaIs100(double area) {
        double x = area / Math.PI;
        return Math.sqrt(x);
    }
    public double areaIfParametersAre100(double parameters) {
        double x = (parameters / 2) / Math.PI;
        return Math.PI * x * x;
    }
}
