package bit.obj.p19;

import java.util.function.Function;
/*
        StringBuilder klasė - efektyviausias būdas tekstinės eilutės formavimui
 */
public class StringBuilderNotes {
    /**
     * Čia kažkas
     */
    int a;

    public static void main(String... args) {

        int count = 10000;

        timer(count, StringBuilderNotes::test1);

        timer(count, StringBuilderNotes::test1b);

        timer(count, StringBuilderNotes::test2);

    }

    /**
     * Metodas nustatantis kiek laiko buvo vykdomas calc:
     * <ul>
     *      <li>sasas</li>
     *      <li>sasas</li>
     *      <li>sasas</li>
     * </ul>
     *
     * @param count ciklo žingnių skaičius
     * @param calc kviečiamas metodas
     */
    static void timer(Integer count, Function<Integer, Long> calc) {
        long startTime = System.nanoTime();

        System.out.print(calc.apply(count));

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(" Laikas: " + (estimatedTime / 1e6) + "ms");
    }

    static long test1(int count) {

        String s = "";
        for (int i = 0; i < count; i++) {
            s += String.valueOf(i);
        }
        return s.length();
    }

    static long test1b(int count) {

        String s = "";
        for (int i = 0; i < count; i++) {
            s = s.concat(String.valueOf(i));
        }
        return s.length();
    }

    /**
     * metodas demonstruojantis kaip gerai dirba StringBuilder'is
     * @param count ciklo žingsnių skaičius
     * @return sugeneruotos eilutės ilgis
     */
    static long test2(int count) {

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            s.append(String.valueOf(i));
        }
        return s.toString().length();
    }
}
