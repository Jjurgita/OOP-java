package bit.obj.p09.color;

public class Container implements IContainer{

    private  int number;
    private Color[] colors = new Color[5]; //creates an array 5 objects long

    @Override
    public void add(Color c) {

    }

    @Override
    public int size() {
        for (Color n : colors){
            number++;
        }
        return number;
    }

    @Override
    public Color get(int index) {
        return colors[index];
    }
}
