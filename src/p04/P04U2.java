package p04;

public class P04U2 {
    public static void main(String[] args) {
        // rasti visus skaicius is intervalo 1...1000, kurie lygus visu savo dalikliu mazesniu uz save pati sumai
        // pvz 27 = 1 + 2 + 4 + 7 + 14

        //ciklas nuo 1 iki 1000
        for (int x = 1; x < 1000; x++) {
            if (perfectNumber(x)) {
                System.out.println("Tobulas numeris: " + x);
            }
        }

    }

    //naudojam metodus
    static boolean perfectNumber(int number) {
        int sum = 0;
        //tikriname ar skaicius yra lygus visu savo dalikliu sumai
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
