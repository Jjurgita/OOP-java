package bit.obj.p14.generics;

public class A implements Color {
    private int color;

    public A(int color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "A: color=" + color;
    }
}
