package bit.obj.p09.color;

public class A implements Color {

    private int color;

    public A(int color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }
}
