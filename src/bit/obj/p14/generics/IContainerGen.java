package bit.obj.p14.generics;

public interface IContainerGen<T> {
    //T - tipo parametras (type)
    void add(T c);
    int size();
    T get(int index);
}
