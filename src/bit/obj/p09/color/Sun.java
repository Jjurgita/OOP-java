package bit.obj.p09.color;

public class Sun implements Color{

    private String color;

    public Sun(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
