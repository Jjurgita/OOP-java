package bit.obj.p14.generics;

public class Container implements IContainer {

    private int size;
    private Color[] colors = new Color[5];

    @Override
    public void add(Color c) {
        if(colors.length == size) {
            Color[] colorsNew = new Color[colors.length + 5];
            for (int i = 0; i < colors.length; i++) {
                colorsNew[i] = colors[i];
            }
            colors = colorsNew;
        }
        colors[size] = c;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Color get(int index) {
        if(index >= size) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + size);
        }
        return colors[index];
    }
}
