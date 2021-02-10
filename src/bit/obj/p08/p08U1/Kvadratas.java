package bit.obj.p08.p08U1;

public class Kvadratas extends Figura {
    private double edge;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double adge) {
        this.edge = adge;
    }

    @Override
    public double getArea() {
        return edge * edge;
    }

    @Override
    public double getParameter() {
        return 4 * edge;
    }
    public double parametersIfAreaIs100(double area) {
        return Math.sqrt(area) * 4;
    }
    public double areaIfParametersAre100(double parameters) {
        double i = parameters / 4;
        return i * i;
    }
}
