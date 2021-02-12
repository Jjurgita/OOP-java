package bit.obj.p18;

public class PolimorfizmasDemo {
    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new B();
        A a3 = new C();

        System.out.println("a1.m2()"); //A.m2 ir A.m1
        a1.m2();

        System.out.println("a2.m2()");//A.m2 ir B.m1 - B class perrašytas m1 metodas
        a2.m2();

        System.out.println("a3.m2()");//C.m2 ir A.m1 - C class perrašytas m2 metodas
        a3.m2();
    }
}

class A {
    protected void m1() {
        System.out.println("A.m1");
    }

    void m2() {
        System.out.println("A.m2");
        m1();
    }
}

class B extends A {
    @Override
    public void m1() {
        System.out.println("B.m1");
    }
}

class C extends A {
    void m2() {
        System.out.println("C.m2");
        m1();
    }
}
