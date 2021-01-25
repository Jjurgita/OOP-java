package bit.obj.p03;

public class P03U3 {
    public static void main(String[] args) {
        //duotas masyvas; surasyti masyvo elentus mazejimo tvarka
        //nenaudoti standartines masyvo rusiavimo funkcijos

        int [] m = {-10, 0, 2, 9, -5};

        //ieskome max reiksmes
        for (int x = 0; x < m.length; x++) {
            int max = m[x];
            int maxPlace = x;

            //tikriname ar reiksme yra didesne uz nustatyta reiksme
            for (int y = x + 1; y < m.length; y++) {
                if (m[y] > max) {
                    max = m[y];
                    maxPlace = y;
                }
            }

            //sukeiciame vietomis
            int number = m[x];
            m[x] = max;
            m[maxPlace] = number;
        }

        //spausdiname
        for (int z : m) {
            System.out.print(z + " ");
        }

//        int [] a = new int[]{-10, 0, 2, 9, -5};
//        Arrays.sort(a);
//        ArrayUtils.reverse(a);
//        System.out.println(Arrays.toString(a));

//        neveikia ArrayUtils.reverse??

    }
}
