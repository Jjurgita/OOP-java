package bit.obj.p19;

import java.util.Calendar;
import java.util.Date;

public class StringNotes {
    public static void main(String... args) {
        /*
                String - pagrindinis duomenų tipas dirbti su tekstine informacija.

                Tekstinę eilutę galima sukurti keliais būdais:
         */
        String s1 = "Sveiki";
        System.out.println(s1);

        String s2 = new String("Viso");
        System.out.println(s2);

        char[] chars1 = { 'L', 'a', 'b', 'a', 's' };
        String s3 = new String(chars1);
        System.out.println(s3);

        String s4 = new String(new char[] { 'L', 'a', 'b', 'a', 's' }, 3, 2);
        System.out.println(s4);

        /*
                STRING KLASĖS METODAI / FUNKCIJOS
         */

        String s = "aąbcčdeęėf".concat("ghijklmnop"); //teksto apjungimas, t.y. tas pats kas +
        System.out.println("s = " + s);
        System.out.println("------------------------------------");

        System.out.println("s.lenght() = " + s.length()); //tekstinės eilutė ilgis
        System.out.println("------------------------------------");

        // toCharArray()
        char[] chars = s.toCharArray(); //grąžinamas simbolių, sudarančių tekstinę eilutę, masyvas char[]

        System.out.print("chars = ");
        for (char c : chars) System.out.print("\'" + c + "\' ");
        System.out.println();
        System.out.println("------------------------------------");

        // getChars() - kopijuoti dalį eilutės į kitą simbolių masyvą
        char[] dst = {'1', '2', '3', '4', '5', '6'};

        System.out.print("dst (prieš) = ");
        for (char c : dst) System.out.print("\'" + c + "\' ");
        System.out.println();
        System.out.println("------------------------------------");

        s.getChars(2, 4, dst, 3);

        System.out.print("dst (po)    = ");
        for (char c : dst) System.out.print("\'" + c + "\' ");
        System.out.println();
        System.out.println("------------------------------------");

        // charAt() - grąžina simbolį pagal jo indeksą
        System.out.println("s[2] = " + s.charAt(2));
        System.out.println("s[3] = " + s.charAt(3));
        System.out.println("------------------------------------");


        //toUpperCase(), toUpperCase(Locale locale) - teksto raidžių pakeitimas į didžiąsias
        //toLowerCase(), toLowerCase(Locale locale) - teksto raidžių pakeitimas į mažąsias
        String s5 = "AĄBCČDEĘėfghijklmnop-SS-ß";
        System.out.println(s5);
        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());
        System.out.println("------------------------------------");

        // equals(Object obj), equalsIgnoreCase(String anotherString)
        System.out.println(s5.equals(null)); // grąžina true, jei obj yra ne null ir eilutės lygios
        System.out.println(s5.equals("aąbcčdeęėfghijklmnop-SS-ß"));
        System.out.println(s5.equalsIgnoreCase("aąbcčdeęėfghijklmnop-SS-ß")); //grąžina true, jei anotherString yra ne null ir eilutės lygios neatsižvelgiant ar raidės didžiosios ar mažosios
        System.out.println("------------------------------------");

        // compareTo(String anotherString), compareToIgnoreCase(String anotherString)
        System.out.println(s5.compareTo("aąbcčdeęėfghijklmnop-SS-ß")); //palyginamos dvi eilutės pagal unikodines simbolių reikšmes
        System.out.println(s5.compareToIgnoreCase("aąbcčdeęėfghijklmnop-SS-ß")); //palyginamos dvi eilutės
        System.out.println("a ? A " + "a".compareTo("A"));
        System.out.println("a ? ą " + "a".compareTo("ą"));
        System.out.println("ą ? b " + "ą".compareTo("b"));
        System.out.println("a ? b " + "a".compareTo("b"));
        System.out.println("------------------------------------");

        String s6 = "AĄBCČDEĘėfghijklmnop";
        System.out.println(s6);

        // startsWith() - tikrinimas ar tekstinė eilutė prasideda nurodytu tekstu prefix
        System.out.println("AĄ... " + s6.startsWith("AĄ"));
        System.out.println("AA... " + s6.startsWith("AA"));
        System.out.println("...ĄBC... " + s6.startsWith("ĄBC", 1));
        System.out.println("------------------------------------");

        // endsWith() -tikrinimas kaip tekstinė eilutė baigiasi
        System.out.println("...mnop " + s6.endsWith("mnop"));
        System.out.println("...pp " + s6.endsWith("pp"));
        System.out.println("------------------------------------");

        // regionMatches() -patikriname ar regionas tekstinėje eilutėje sutampa su regionu eilutėje other
        System.out.println(s6.regionMatches(12, "01234ijkl", 4, 3));
        System.out.println(s6.regionMatches(12, "01234ijkl", 5, 3));
        System.out.println(s6.regionMatches(12, "01234ijkl", 6, 3));
        System.out.println(s6.regionMatches(13, "01234ijkl", 6, 3));
        System.out.println("------------------------------------");

        // substring() - grąžina naują eilutę pradedant nuo beginIndex iki eilutės pabaigos arba iki endIndex
        System.out.println(s6.substring(10));
        System.out.println(s6.substring(10, 12));
        System.out.println("------------------------------------");

        String s7 = "Geri vyrai geroj girioj gerą girą gers";
        System.out.println(s7);

        // indexOf() - tikrinimas (pradedant fromIndex) ar yra tekstinė eilutė - grąžinimas jos pirmo simbolio indeksas
        // lastIndexOf() - tikrinimas (pradedant fromIndex) ar yra tekstinė eilutė - grąžinimas jos paskutinio atitikmens pirmo simbolio indeksas
        System.out.println("indexOf(ger) = " + s7.indexOf("ger"));
        System.out.println("indexOf(ger, 20) = " + s7.indexOf("ger", 20));
        System.out.println("lastIndexOf(ger) = " + s7.lastIndexOf("ger"));
        System.out.println("indexOf(ger) = " + s7.indexOf("ger"));
        System.out.println("indexOf(geg) = " + s7.indexOf("geg"));
        System.out.println("------------------------------------");

        // replace() - grąžinama nauja eilutė kurioje target simbolių seka pakeičiama replacement seka
        System.out.println("replace(ger, Gier) = " + s7.replace("ger", "Gier"));
        System.out.println("------------------------------------");

        // valueOf() - argumentą paverčia tekstine eilute
        System.out.println(String.valueOf(123));
        System.out.println(String.valueOf(12.3));
        System.out.println(String.valueOf(new char[] {'a', 'b', 'c', 'd'}, 1, 2));
        System.out.println("------------------------------------");

        // format() - argumentus paverčia tekstine eilute pagal nurodytą formatą:
        /*
            %[argument_index$][flags][width][.precision]conversion

            vietoj conversion:
                 - b / B - argumentas boolean/Boolean - išveda true/false
                 - s / S - jei argumentas Formattable tai kviečia .formatTo() kitaip kviečia .toString() d - išvedamas kaip sveikas skaičius
                 - e / E / f / g / G - dešimtainis skaičius su kableliu
                 - t / T - data ir laikas
        */
        System.out.println(String.format("Labas: %d;%05d;%2d", 123, 123, 123));
        System.out.println(String.format("%g %e=%2$10.2f", 10.2987654321, 1.2987654321));
        System.out.println(String.format("Dabar: %1$tA, %1$tY %1$tB", new Date()));
        System.out.format("Local time: %tT", Calendar.getInstance());
        System.out.println("------------------------------------");

        // matches() - grąžina true jei reguliari pilnai atitinka tekstinę eilutę
        System.out.println("abc ? a.*: " + "abc".matches("a.*"));
        System.out.println("abc ? ab.: " + "abc".matches("ab."));
        System.out.println("abc ? abb: " + "abc".matches("abb"));

        // replaceFirst() - grąžina naują eilutę kurioje pirmas regex atitikimas pakeičiamas replacement
        System.out.println("ananasas: a. -> Nan: " + "ananasas".replaceFirst("a.", "Nan"));

        // replaceAll() - grąžina naują eilutę kurioje visi regex atitikimai pakeičiami replacement
        /*
                P.s regex eilutėje galima aprašyti grupes ir tada jas panaudoti replacement eilutėje.
                Grupės apsirašo įdedant simbolius į paprastus skliaustelius, o jų panaudojimas nurodomas kaip $1, $2 ir t.t. kur 1, 2, ... yra grupės eilės numeris eilutėje regex
         */
        System.out.println("ananasas: a. -> Nan: " + "ananasas".replaceAll("a.", "Nan"));
        System.out.println("13/12/2018 -> " + "13/12/2018".replaceAll("(\\d+)/(\\d+)/(\\d+)", "$3-$2-$1"));


        // split() - suskaldo eilutę į eilučių masyvą, bet ne daugiau kaip į limits
        String[] strings = "ananasas\t agurkas   apelsinas abrikosas".split("as((\\s+)|$)");
        System.out.println(strings.length + ": ");
        for (String s8 : strings) System.out.println(s8);

        strings = "ananasas agurkas apelsinas abrikosas".split("as\\s+", 2);
        System.out.println(strings.length + ": ");
        for (String s9 : strings) System.out.println(s9);

        strings = "aronija2 ananasas,agurkas-apelsinas;abrikosas.arbuzas?agurotis!agrastas_anakardis$avokadas".split("[\\d_\\W]+");
        System.out.println(strings.length + ": ");
        for (String s10 : strings) System.out.println(s10);
    }
}
