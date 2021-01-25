package bit.obj.p06;

import bit.obj.p06.notes.prat1.Student;

public class P06U2 {
    public static void main(String[] args) {
        /*
        Mokykla organizuoja mokinių turnyrą.Turnyras bus rengiamas taurės principu,t.y.susitinka du ir tik laimėtojas išeina į kitą ratą ir t.t.
        Atspausdinkite turnyro susitikimų lentelę, t.y. kuriame rate kas su kuo žaidžia.
        Kiekvienai porai suteikite eilės numerį, kad galėtumėt jas identifikuoti,
        pvz, jei turim 7 vaikus, tai 6 žaidžia pirmame rate, o vienas (Petras) papuola iš kart į antrą ratą, nes neturi poros pirmame rate:

        1 ratas - 1/4:
            1) Jonas - Ona
            2) Marytė - Ilona
            3) Juozas - Marius
        2 ratas - pusfinalis:
            4) 1poros laimėtojas - Petras
            5) 2poros laimėtojas - 3 poros laimėtojas
        3 ratas - finalas:
            4 poros laimėtojas - 5 poros laimėtojas

        Išbandyti programą su įvairiu mokinių skaičiumi: 2, 3, 4, 5, 6, 33
         */

        Student[] students = new Student[] {
                new Student(2, "Jonas", "Kazys", new int[] {8, 9, 8, 10}),
                new Student(3, "Petras", "Petraitis", new int[] {6, 4, 8, 4}),
                new Student(1, "Antanas", "Antanaitis", new int[] {7, 7, 7, 10}),
                new Student(1, "Jurgis", "Jurgaitis", new int[] {8, 10, 10, 10}),
                new Student(3, "Juozas", "Juozaitis", new int[] {6, 9, 4, 7}),
                new Student(4, "Jone", "Jonaite", new int[] {9, 10, 8, 10}),
                new Student(2, "Ona", "Onute", new int[] {7, 6, 8, 5}),
                new Student(4, "Marija", "Petraite", new int[] {5, 6, 8, 10}),
                new Student(3, "Goda", "Godute", new int[] {7, 9, 8, 5})
        };

        System.out.println("1 ratas - 1/4:\n" + students[0].firstname + " - " + students[1].firstname + "\n");

    }
}
