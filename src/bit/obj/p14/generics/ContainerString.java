package bit.obj.p14.generics;

public class ContainerString implements IContainerString{

    private String[] colors = new String[5];
    private int size; // = 0

    @Override
    public void add(String c) {
        if (colors.length == size) {
            // praplesti masyva
            String[] colorsNew = new String[colors.length + 5];
            for (int i = 0; i < colors.length; i++) colorsNew[i] = colors[i];
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
    public String get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + size);
        }
        return colors[index];
    }
}
