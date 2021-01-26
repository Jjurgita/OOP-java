package bit.obj.p07.notes;

import java.math.BigInteger;

public class ChessGrains {

//    public static void main (String[] args)
//    {
//        grainCounter(64);
//    }
//
//    public static void grainCounter( int squares )
//    {
//        BigInteger number = new BigInteger("2");
//        for (int i = 1; i <= squares; i++)
//        {
//            System.out.println("square " + i + ":  " + number + " grains.");
//            number = number.multiply(new BigInteger("2"));
//        }
//    }

    public static void main(String[] args) {
        BigInteger grains = BigInteger.valueOf(2);
        for (int i=1; i < 65; i++)
        {
            System.out.println("Square: " + String.format("%d", i) + " - " + String.format("%d", grains));
            grains = grains.multiply(BigInteger.valueOf(2));
        }
    }
}
