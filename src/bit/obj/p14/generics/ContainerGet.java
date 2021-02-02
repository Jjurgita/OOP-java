package bit.obj.p14.generics;

public class ContainerGet<T> implements IContainerGen<T> {
    private Object[] colors = new Object[5];
    private int size; // = 0

    @Override
    public void add(T c) {
        if (colors.length == size) {
            // praplesti masyva
            Object[] colorsNew = new Object[colors.length + 5];
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
    public T get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + size);
        }
        return (T) colors[index];
    }
}
