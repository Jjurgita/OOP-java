package p04;

public class P04U1 {
    public static void main(String[] args) {
        // rasti masyvo skaiciu vidurki; atspausdinti masyvu vidurkiu skirtuma
        int [] a = {5, 6, 10, 15, 8, 4};
        int [] b = {8, 5, 3};

        int suma = 0;
        for (int i : a) {
            suma += i;
        }

        double vidurkis = (double) suma / a.length;
        System.out.println("Pirmojo masyvo vidurkis = " + vidurkis);

        int suma2 = 0;
        for (int j : b) {
            suma2 += j;
        }

        double vidurkis2 = suma2 / (double) b.length;
        System.out.println("Antrojo masyvo vidurkis = " + vidurkis2);

        double skirtumas = vidurkis - vidurkis2;
        System.out.println("Skirtumas yra lygus " + skirtumas);
    }
}
