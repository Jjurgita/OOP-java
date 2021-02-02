package bit.obj.p10;

public class UsefulMethods {
    public static void main(String[] args) {

        //MIN_VALUE, MAX_VALUE - atitinkamos klasės galimai mažiausia ir didžiausia reikšmės:
        System.out.println("Max Integer = " + Integer.MAX_VALUE);
        System.out.println("Max Long = " + Long.MAX_VALUE);

        //compare(x, y) ir compareTo(y) - metodai palyginantys vieną reikšmę su kita
        //ir grąžinantys int atitinkamai < 0, 0 ir > 0, jei pirmasis skaičius yra mažesnis, lygus ar didenis už kitą skaičių
        System.out.println(Integer.compare(1, 2));
        System.out.println(Integer.compare(1, 1));
        System.out.println(Integer.compare(10, 1));

        System.out.println("Max radix = " + Character.MAX_RADIX);

        //valueOf(...) - sukonstruojamas atitinkamos klasės objektas iš kitų panašių duomenų ar tekstinės eilutės - analogas konstruktoriui
        System.out.println("20 (10) = " + Integer.valueOf("20"));
        System.out.println("20 (16) = " + Integer.valueOf("20", 16));
        System.out.println("20 (8) = " + Integer.valueOf("20", 8));
        System.out.println("20 (5) = " + Integer.valueOf("20", 5));
        System.out.println("20 (36) = " + Integer.valueOf("20", 36));

        //parseInt(String s), parseDouble(String s),... - atitinkami metodai iš tekstinės eilutės konstruoti primityvius tipus
        System.out.println("FF (16) = " + Integer.parseInt("FF", 16));
        System.out.println("100 (2) = " + Integer.parseInt("100", 2));
        System.out.println("123 = " + Integer.parseInt("123"));
        System.out.println("3.14 = " + Double.parseDouble("3.14"));
        System.out.println("2e4 = " + Double.parseDouble("2e4"));
        System.out.println("arbuzas = " + Long.parseLong("arbuzas", 36));

    }
}
