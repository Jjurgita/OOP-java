package bit.obj.p06.notes.p06U2;

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

        Mokinys[] mokiniai = new Mokinys[] {
                new Mokinys("Jonas"),
                new Mokinys("Ona")
        };

        System.out.println("1 ratas - 1/4:\n");

    }
}
