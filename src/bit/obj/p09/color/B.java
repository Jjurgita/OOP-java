package bit.obj.p09.color;

public class B implements Color {

    private int color;

    public B(int color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }
}
