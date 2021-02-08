package bit.obj.p16.streams.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    /*
            NAUJOS SĄSAJOS/KLASĖS
     */
    public static void main(String[] args) {

        // Function<T, R> turi vieną parametrą tipo T ir grąžina rezultatą R tipo
        Function<String, Integer> convert = Integer::parseInt;
        System.out.println("convert 123 -> " + convert.apply("123"));

        // Predicate<T> - operacija (funkcija), kuri turi vieną parametrą tipo T ir grąžina boolean tipo rezultatą
        Predicate<Integer> positive = x -> x != null && x > 0;
        System.out.println("positive(1) " + positive.test(1));
        System.out.println("positive(-2) " + positive.test(-2));
        System.out.println("positive(null) " + positive.test(null));

        // Supplier<T>  - neturi parametrų ir grąžina T tipo rezultatą
        Supplier<Integer> generator = new Random()::nextInt;
        //Random r = new Random();
        // ... = () -> r.nextInt();


        // Optional<T> - klasė skirta darbui su T tipo objektais kurie gali būti ir null
        List<Optional<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int r = generator.get();
            System.out.println("random #" + i + " -> " + r);

            Optional<Integer> opt = r < 0 ? Optional.empty() : Optional.of(r);
            list.add(opt);
        }
        long sum = 0;
        for (Optional<Integer> opt : list) {
            //sum += opt.isPresent() ? opt.get() : 0;
            sum += opt.orElse(0);
        }
        System.out.println("sum = " + sum);

        Optional<Integer> op = Optional.ofNullable(0);
        int a = op.orElse(1);
        System.out.println("a = " + a);

    }
}
