public class P04U4 {
    public static void main(String[] args) {
        //suapvalinti double tipo skaicius pagal nurodyta tiksluma
        //panaudoti Math.floor() funkcija

        System.out.println("\n5.55555555555555555555555555 -> " + floorToDecimals(5.55555555555555555555555555, 3));
    }
    public static double floorToDecimals(double number, int decimals) {
        double pr = Math.pow(10.0, decimals);
        return Math.floor(number * pr) / pr;
    }
}
