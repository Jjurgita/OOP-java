package p03;

public class P03U1_2 {

    public static void main(String[] args) {

        int [][] triangles = {{3, 4, 5}, {2, 10, 8}, {5, 6, 5}, {5, 5, 5}};

        for (int[] a : triangles) {
            //tas pats uzrasymas kaip iprasto for
            // for(int i = 0; i < triangles.length; i++) {
            //      int [] a = triangles[i];
            // }

            System.out.print("Trikampis: " + a[0] + ", " + a[1] + ", " + a[2]);
            //tikriname, ar duoti skaiciai gali buti trikampio krastiniu ilgiai
            if (a[0] < a[1] + a[2] && a[1] < a[0] + a[2] && a[2] < a[0] + a[1]) {
                System.out.print(" yra galimas ");

                //tikriname, ar trikampis yra lygiakrastis
                if (a[0] == a[1] && a[1] == a[2]) {
                    System.out.print("- lygiakrastis.");
                }
                //ar trikampis yra lygiasonis
                else if (a[0] == a[1] || a[1] == a[2] || a[0] == a[2]) {
                    System.out.print("- lygiasonis.");
                } else {
                    System.out.print("- ivairiakrastis.");
                }

                //apskaiciuoti galimu trikampiu plotus

                //pusperimetris
                double pp = (a[0] + a[1] + a[2]) / 2.0;

                //plotas
                double plotas = Math.sqrt(pp * (pp - a[0]) * (pp - a[1]) * (pp - a[2]));

                //suapvaliname - du skaiciai po kablelio
                plotas = Math.round(plotas * 100.0) / 100.0;
                System.out.println(" Plotas: " + plotas);

            } else {
                System.out.println(" yra negalimas.");
            }
        }
    }
}
