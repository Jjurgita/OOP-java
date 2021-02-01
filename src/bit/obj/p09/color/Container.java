package bit.obj.p09.color;

public class Container implements IContainer{

    private IColor[] colors = new IColor[5];

    @Override
    public void add(IColor c) {
        //?
    }

    @Override
    public int size() {
        //?
        return 0;
    }

    @Override
    public IColor get(int index) {
        return colors[index];
    }
}
