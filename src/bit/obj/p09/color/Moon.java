package bit.obj.p09.color;

public class Moon implements Color{

    private String color;

    public Moon(String color) {
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
