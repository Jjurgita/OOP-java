package bit.obj.p10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoreBigDecimal {
    public static void main(String[] args) {

        /*
            BigDecimal labai naudinga klasė, jei reikia atlikti skaičiavimus norimu tikslumu - pvz. skaičiuoti pinigus.
            Kai kuriamas BigDecimal galima nurodyti sveiką skaičių (unscaledVal - int, Integer arba BigInteger tipo) ir tikslumą (scale):

                    BigDecimal a1 = BigDecimal.valueOf(1234, 2);

            arba skaičių galima nurodyti kaip tekstinę eilutę:

                    BigDecimal a2 = new BigDecimal(“12.34”);
         */

        BigDecimal a = BigDecimal.valueOf(1234, 2);
        BigDecimal b = a.multiply(BigDecimal.valueOf(3.49));

        System.out.println("1234 x 10-2 = " + a);
        System.out.println("12.34 x 3.49 = " + b);

        BigDecimal d = new BigDecimal("2.1");
        BigDecimal e = d.divide(BigDecimal.valueOf(2),1, RoundingMode.HALF_UP);
        BigDecimal f = d.divide(BigDecimal.valueOf(2),1, RoundingMode.HALF_DOWN);
        BigDecimal g = d.divide(BigDecimal.valueOf(2),1, RoundingMode.HALF_EVEN);

        System.out.println("2.1 / 2 = 1.05 = " + e + " HALF_UP");
        System.out.println("2.1 / 2 = 1.05 = " + f + " HALF_DOWN");
        System.out.println("2.1 / 2 = 1.05 = " + g + " HALF_EVEN");

        BigDecimal i = new BigDecimal("2.3");
        BigDecimal j = i.divide(BigDecimal.valueOf(2),1, RoundingMode.HALF_UP);
        BigDecimal k = i.divide(BigDecimal.valueOf(2),1, RoundingMode.HALF_DOWN);
        BigDecimal l = i.divide(BigDecimal.valueOf(2),1, RoundingMode.HALF_EVEN);

        System.out.println("2.3 / 2 = 1.15 = " + j + " HALF_UP");
        System.out.println("2.3 / 2 = 1.15 = " + k + " HALF_DOWN");
        System.out.println("2.3 / 2 = 1.15 = " + l + " HALF_EVEN");

        //Nerekomenduojame naudoti BigDecimal konstruktorių su double tipo argumentu dėl to,kad kompiuteryje tokie skaičiai visada apvalinami ir saugojami ne tiksliai tokie kokius mes juos įvedame.
        //Jei sukonstruoti BigDecimal skaičių su kableliu tai geriau naudoti konstruktorių su tekstinės eilutės argumentu arba konstruktorių su sveikais skaičiais - reikšme ir skale.
        BigDecimal a1 = new BigDecimal(1.23);
        BigDecimal b1 = new BigDecimal("1.23");

        System.out.println("1.23 = " + a1);
        System.out.println("1.23 = " + b1);
    }
}
