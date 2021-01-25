package bit.obj.p06.multiplication;

public class MultiTable {
    public static void main(String[] args) {
        //Atspausdinti daugybos lentele

        // _1 x _1 = __1
        // _4 x _4 = _16
        // 10 x 10 = 100

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 5; j++){
                System.out.print(" " + printD(j) + " x " + printD(i) + " = " + printR(i * j) + "   ");
            }
            System.out.println();
        }
        System.out.println();

        for (int x = 1; x <= 10; x++){
            for (int y = 6; y <= 10; y++){
                System.out.print(" " + printD(y) + " x " + printD(x) + " = " + printR(x * y) + "   ");
            }
            System.out.println();
        }
    }

    static String printD(int d) {
        return (d < 10 ? " " : "") + d;
    }

    static String printR(int r) {
        return (r < 10 ? "  " : r < 100 ? " " : "") + r;
    }
}
