package bit.obj.p05.inheritance.override;

import java.util.Objects;

public class Figura extends Object {
    //figuros centras:
    private int x;
    private int y;
    //laipsnis - kaip pasukta
    private double d;

    //plotas
    public double area() {
        return 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figura figura = (Figura) o;
        return x == figura.x && y == figura.y && Double.compare(figura.d, d) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, d);
    }

    @Override
    public String toString() {
        return "Figura{" +
                "x=" + x +
                ", y=" + y +
                ", d=" + d +
                '}';
    }
}
