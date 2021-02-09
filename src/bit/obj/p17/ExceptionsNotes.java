package bit.obj.p17;

import java.util.Arrays;
import java.util.List;

public class ExceptionsNotes {
    public static void main(String[] args) {

        //tam, kad apeitume/pagautume exceptioną, naudojame try/catch
        //catch tvarka yra labai svarbi, viskas turi eiti iš eilės
        try {
            System.out.println(Service.getIntValue(0));
            System.out.println(Service.getIntValue(2));
            System.out.println(Service.getIntValue(3));
            System.out.println(Service.getIntValue(4));

            int x = Service.calculation(12, 5);
            System.out.println(x);

            x = Service.calculation(12, -5);
            System.out.println(x);

            int y = Service.calculation(13,0);
            System.out.println(y);
        } catch (ArithmeticException e) {
            //kiekvienas Exception turi e-message, kurią grąžina išėjus exception; ją galime atspausdinti atskirai console su getMessage() fukcija
            //galime atspausdinti ir "pėdsaką" su printStackTrace()
            e.printStackTrace();
            System.err.println("Kažkokia aritmetinė klaida: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Neteisingi duomenys: " + e.getMessage());
        } catch (Exception e) { //gaudom BETKOKĮ exception - taip galima pagauti beveik VISUS exceptions - įrašant Exception
            e.printStackTrace();
            System.err.println("Klaida: " + e.getMessage());
        }
        System.out.println("The End");
        //system.err ir system.out yra output streamai, kurie išmetami neaprašoma tvarka, priklausomai nuo sistemos
        //system.out - veda į console
        //system.err - gali vesti ir į kažkokį nurodytą failą, kurį/duomenis galima panaudoti/analizuoti vėliau
    }
}

class Service {

    static private List<Integer> listas = Arrays.asList(100, 200, 300, null);

    static public int calculation(int a, int b) {
        //patikrinam, ar yra teigiamas/neigiamas skaičius
        //jeigu < 0, metam klaidą
        if (b < 0) {
            throw new IllegalArgumentException(b + " < 0");
        }
        return a / b;
    }

    static public int getIntValue(int index) {
        try {
            Integer value = listas.get(index);
            return value;
        } catch (NullPointerException e) {
            //galime atspausdinti pranešimą, jog exceptionas įvyko
            System.out.println("Nulis:");
            return 0;
        }
    }
}
