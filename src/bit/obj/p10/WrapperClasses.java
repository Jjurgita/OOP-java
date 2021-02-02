package bit.obj.p10;

import java.math.BigInteger;

public class WrapperClasses {
    /*
        Yra klases, kurios "supakuoja" atitinkamus tipus:
        byte - Byte
        short - Short
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        chart - Character
     */
    public static void main(String[] args) {

        int a = 11;
        Integer b = new Integer(3);

        System.out.println(a / b.intValue());
        System.out.println(a / b.doubleValue());

        Double c = null;
        System.out.println(a * c);


        /*
            Skaiciu klases turi 1 bendra tevinia klase - Number, kuri turi ir daugiau vaikų:
                 - BigInteger, BigDecimal - atlikti veiksmus su labai dideliais skaiciais
                 - AtomicInteger, AtomicLong - skirtos darbui is daugelio giju (multithread)
         */

        Long a1 = 1L;
        for (int i = 0; i < 64; i++) a1 = a1 * 2;
        System.out.println(a1);


        BigInteger b1 = BigInteger.valueOf(1);
        for (int i = 0; i < 64; i++) b1 = b1.multiply(BigInteger.valueOf(2));
        System.out.println(b1);

        /*
            Ten, kur reikia, java kompiliatorius automatiškai bando versti primityvų tipą į atitinkamos klasės objektą (autoboxing) ir atvirksciai (unboxing)
         */

        Double pi = 3.141528;
        Double r = 6371.1;

        double ilgis = 2 * pi * r;
        System.out.println("Žemės ilgis aplink pusiaują " + ilgis + "km");
    }
}
