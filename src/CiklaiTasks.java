public class CiklaiTasks {
    public static void main(String[] args) {
        // UZDAVINIAI


        // rasti masyvo skaiciu vidurki; atspausdinti masyvu vidurkiu skirtuma
        int [] a = {5, 6, 10, 15, 8, 4};
        int [] b = {8, 5, 3};

        int suma = 0;
        for (int elem : a) {
            suma += elem;
        }
        double suma1 = suma; // int pakeiciau i double (skaicius su kableliu)
        double vidurkis = suma1 / a.length;
        System.out.println(suma);
        System.out.println(vidurkis);

        int suma2 = 0;
        for (int elem : b) {
            suma2 += elem;
        }
        double suma3 = suma2;
        double vidurkis2 = suma3 / b.length;
        System.out.println(suma2);
        System.out.println(vidurkis2);

        double skirtumas = vidurkis - vidurkis2;
        System.out.println(skirtumas);

        // rasti visus skaicius is intervalo 1...1000, kurie kygus visu savo dalikliu mazesniu uz save pati sumai
        // pvz 27 = 1 + 2 + 4 + 7 + 14

        // duotame intervale rasti visus pirminius skaicius

        // suapvalinti double tipo skaicius pagal nurodyta tiksluma; panaudoti matametine funkcija Math.floor()

    }
}
