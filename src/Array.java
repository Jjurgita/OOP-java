import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //duotas masyvas; surasyti masyvo elentus mazejimo tvarka
        //nenaudoti standartines masyvo rusiavimo funkcijos

        int [] m = {-10, 0, 2, 9, -5};

        int x = 0;

        for (int i = x + 1; i < m.length; i++) {
            if (m[x] < m[i]) {
                x = i;
            }
        }

//        int [] a = new int[]{-10, 0, 2, 9, -5};
//        Arrays.sort(a);
//        ArrayUtils.reverse(a);
//        System.out.println(Arrays.toString(a);

//        neveikia ArrayUtils.reverse??

    }
}
