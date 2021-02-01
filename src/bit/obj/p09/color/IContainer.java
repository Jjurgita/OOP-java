package bit.obj.p09.color;

public interface IContainer {

    void add(Color c); //idedam objekta
    int size(); //kiek objektu jau yra ideta
    Color get(int index);//nurodom index ir jis grazina ideto objekto vieta

}
