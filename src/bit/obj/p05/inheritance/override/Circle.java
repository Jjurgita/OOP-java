package bit.obj.p05.inheritance.override;

import java.util.Objects;

public class Circle extends Figura {
    //spindulys
    private double r;

    //anotacija - pazymiu, kad metodas yra overidintas
    @Override
    public double area() {
        return Math.PI * r * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() + ", " +
                "r=" + r +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), r);
    }
}
