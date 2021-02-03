package bit.obj.p12.nested_class_anonymous;

public interface A {
    long pow2();
}

class BBB {

    void a() {
        A kazkas = new A() {
            @Override
            public long pow2() {
                return 200;
            }
        };

        System.out.println(kazkas.pow2());
    }
}
