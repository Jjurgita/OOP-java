package bit.obj.p09.color;

public class Container implements IContainer{

    private int object = 0;
    private int number;
    private Color[] colors = new Color[5];


    @Override
    public void add(Color c) {
        colors[object] = c;
        object++;
    }

    @Override
    public int size() {
        number = colors.length;
        return number;
    }

    @Override
    public Color get(int index) {
        return colors[index];
    }





}
