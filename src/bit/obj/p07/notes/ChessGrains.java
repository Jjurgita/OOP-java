package bit.obj.p07.notes;

import java.math.BigInteger;

public class ChessGrains {
    /*
    į pirmą šachmatų lentos laukelį reikėjo padėti 1 grūdą,
    į antrą 2,
    į trečią 2 x 2 = 4,
    į ketvirtą 4 x 2 = 8,
    į penktą – 8 x 2 = 16 ir taip iki 64 langelio..
     */
    public static void main(String[] args) {
        BigInteger grains = BigInteger.ONE;
        BigInteger grainsSum = BigInteger.ZERO;

        for (int i=1; i < 65; i++) {
            grainsSum = grainsSum.add(grains);
            System.out.println("Square: " + String.format("%d", i) + " - " + String.format("%d", grains));
            grains = grains.multiply(BigInteger.TWO);
        }
        System.out.println("Total: " + grainsSum);
    }

    //su funkcija:
//    public static void main (String[] args) {
//        grainCounter(64);
//    }
//
//    public static void grainCounter( int squares ) {
//        BigInteger number = new BigInteger("1");
//        for (int i = 1; i <= squares; i++){
//            System.out.println("square " + i + ":  " + number + " grains.");
//            number = number.multiply(new BigInteger("2"));
//        }
//    }
}
