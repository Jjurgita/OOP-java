package bit.obj.p08.p08U1;

public class Trikampis extends Figura {
    private double edge;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * (edge * edge);
    }

    @Override
    public double getParameter() {
        return 3 * edge;
    }

    public double parametersIfAreaIs100(double area) {
        double x = (Math.sqrt(3) / 4) * area;
        return Math.sqrt(x);
    }

    public double areaIfParametersAre100(double parameters) {
        double x = parameters / 3;
        return (Math.sqrt(3) / 4) * (x * x);
    }
}
