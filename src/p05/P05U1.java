package p05;

import p05.Mokinys;

public class P05U1 {
    public static void main(String[] args) {

        //Tarkime turime masyvą objektų Mokinys. Reikia atspausdinti mokinių vardus ir pavardes surūšiuotus pagal klases ir pagal pavardes bei vardus.
        //Pastaba: nustatykite keliems iš vienos klasės mokiniams tas pačias pavardes bet skirtingus vardus, kad patikrinti ar gerai rūšiuoja.

        //susikurti Mokiniu masyva nurodant pilna kelia ir class pavadinima
        //taip rasyti nera visad patogu, taciau galima
        //p05.Mokinys[] mokiniai = new p05.Mokinys[5];

        //jeigu nenorime rasyti ilgu pavadinimu, reikia import pradzioje class kelia
        Mokinys[] mokiniai = new Mokinys[]{
                new Mokinys("Antanas", "Pertrauskas", 1),
                new Mokinys("Jonas", "Sirtautas", 2),
                new Mokinys("Ona", "Onaite", 3),
                new Mokinys("Kazimieras", "Penktadienis", 4),
                new Mokinys("Egle", "Liepaite", 1),
                new Mokinys("Ruta", "Jonaite", 3),
                new Mokinys("Antanas", "Antanaitis", 4),
                new Mokinys("Saule", "Liepaite", 1),
                new Mokinys("Ugne", "Jonaite", 3)
        };

        //spausdinam pilna sukurta mokiniu sarasa
        System.out.println("Pirminiai duomenys: ");
        print(mokiniai);

        //sulygiuoti pagal klase, pavardes
        for (int i = 0; i < mokiniai.length - 1 ; i++) {
            for (int j = i + 1; j < mokiniai.length; j++){
//                if (mokiniai[i].level > mokiniai[j].level) {
//                    //susikuriam laikina kintamaji tmp
//                    // i <-> j (atliekam kaip su tom dviem stiklinem - perpilt reikia triju stikliniu)
//                    Mokinys tmp = mokiniai[i];
//                    mokiniai[i] = mokiniai[j];
//                    mokiniai[j] = tmp;
//                }
                if (compare(mokiniai[i], mokiniai[j]) > 0) {
                    Mokinys tmp = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = tmp;
                }
            }
        }
        System.out.println("Surusiuota info: ");
        print(mokiniai);
    }

    //apsirasom metoda print, kad nereiktu vis to paties rasyti - reiks prideti tik "print(mokiniai);"
    static void print(Mokinys[] mokiniai) {
        for (Mokinys m : mokiniai) {
            System.out.println(m.firstname + " " + m.lastname + " " + m.level);
        }
    }

    //palyginimui lastname naudojame compare.to
    static int compare(Mokinys m1, Mokinys m2) {
        if (m1.level < m2.level) return -1;
        if (m1.level > m2.level) return 1;
        return m1.lastname.compareTo(m2.lastname);
    }
}
