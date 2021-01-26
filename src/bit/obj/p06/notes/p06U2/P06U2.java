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

        // bandyti pradzioj su subalansuotais zaideju skaiciais: 8, 16 ir pan. Paskui bandyti su kitais/nesubalansuotais skaiciais
        Player[] players = {
                new Player(1,"Jonas"),
                new Player(1,"Ona"),
                new Player(2,"Maryte"),
                new Player(2,"Ilona"),
                new Player(3,"Juozas"),
                new Player(3,"Marius"),
                new Player(4,"Petras"),
                new Player(4,"Robertas")
        };

        for (int i = 0; i < players.length - 1 ; i++) {
            for (int j = i + 1; j < players.length; j++) {
                if (players[i].getGroup() == 1 && players[j].getGroup() == 1) {
                    System.out.println("1 ratas - 1/4:\n" + "     " + players[i].getGroup() + ") " + players[i].getFirstname() + " - " + players[j].getFirstname());
                }
                if (players[i].getGroup() == 2 && players[j].getGroup() == 2) {
                    System.out.println("     " + players[i].getGroup() + ") " + players[i].getFirstname() + " - " + players[j].getFirstname());
                }
                if (players[i].getGroup() == 3 && players[j].getGroup() == 3) {
                    System.out.println("     " + players[i].getGroup() + ") " + players[i].getFirstname() + " - " + players[j].getFirstname());
                }
                if (players[i].getGroup() == 4 && players[j].getGroup() == 4) {
                    System.out.println("     " + players[i].getGroup() + ") " + players[i].getFirstname() + " - " + players[j].getFirstname());
                }
            }
        }
        System.out.println("2 ratas - pusfinalis:");
        System.out.println("     5) 1poros laimėtojas - 2poros laimėtojas\n" + "     6) 3poros laimėtojas - 4poros laimėtojas");
        System.out.println("3 ratas - finalas:");
        System.out.println("     7) 5poros laimėtojas - 6poros laimėtojas");

    }
}
