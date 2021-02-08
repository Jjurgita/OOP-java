package bit.obj.p12;

class A1 {
    int a1() {
        return 1;
    }
}

class A2 extends A1 {
    final int a1() {
        return 2;
    }
}

class A3 extends A2 {
//    int a1() {
//        return 3;
//    }
}