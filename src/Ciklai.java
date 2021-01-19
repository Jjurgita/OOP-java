public class Ciklai {
    public static void main(String[] args) {

        // a == b  true, jei a lygu b
        // a != b  true, jei a nelygu b
        // a > b   true, jei a daugiau uz b
        // a >= b  true, jei a daugiau arba lygu b
        // a < b   true, jei a maziau uz b
        // a <= b  true, jei a maziau arba lygu b
        // !a      true, jei a yra false
        // a && b  true, jei ir a ir b yra true
        // a || b  true, jei bent vienas a arba b yra true

        // OPERACIJA "?:"
        // <logine israiska> ? <resultatas, jei true> : < rezultatas, jei false>
        int a = 100;
        String rez = "a yra " + (a < 100 ? "maziau" : "daugiau") + " uz simta";
        System.out.println(rez);
        System.out.println(a % 2 == 0 ? "lyginis" : 0);

        // WHILE ciklas
        int i = 1, suma = 0; //sukuriami du int kintamieji vienu metu
        while (i <= 100) {
            suma += i++;
            //tas pats kaip:
            // suma = suma + i;
            // i = i + 1;
        }
        System.out.println("1 + 2 + ... + 100 = " + suma);

        // DO WHILE ciklas
        // padaro veiksma ir tik tada tikrina salyga
        int j = 2, sum = 0;
        do {
            sum += j;
            j += 2;
        } while (j <= 100);
        System.out.println("2 + 4 + ... + 100 = " + sum);

        // FOR ciklas
        int s = 0;
        for (int l = 1; l <= 100; l++) {
            s += l;
        }
        System.out.println("1 + 2 + ... + 100 = " + suma);

        int[] b = {10, 50, -5, 15};
        int suma1 = 0;
        for (int k = 0; k < b.length; k++) {
            suma1 += b[k];
        }
        System.out.println("Suma = " + suma1);

        // for dalies kitoks aprasymas:
        // sukuriamas kintamasis int ir prisikiriamas array[]
        int[] c = {10, 50, -5, 15};
        int suma2 = 0;
        for (int elem : c) {
            suma2 += elem;
        }
        System.out.println("Suma = " + suma2);

        // CIKLO VALDYMAS
        // jeigu is ciklo norime iseiti anksciau laiko - "break"
        // norime nevykdyti likusiu ciklo sakiniu ir grizti i ciklo pradzia - "countinue"

    }
}
