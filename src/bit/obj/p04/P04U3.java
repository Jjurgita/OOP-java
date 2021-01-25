package bit.obj.p04;

public class P04U3 {
    public static void main(String[] args) {
        // duotame intervale rasti visus pirminius skaicius
        // intervalas 1 - 1000

        findPrimeNumbersInInterval(1,100);
    }

    public static void findPrimeNumbersInInterval(int from, int to) {
        if (from < 0 || to < 0 || to < from) {
            System.out.println("Numbers can't be negative, from < to;");
            return;
        }
        System.out.printf("Prime numbers from %d to %d are: ", from, to);
        for (int i = from; i <= to; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0) return false;
        }
        return number > 1;
    }
}
