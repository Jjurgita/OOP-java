package bit.obj.p16.streams;

import java.io.*;

/*
      STREAMS (srautai) skirti aprašyti ir vykdyti veiksmus su kolekcijos elementais.

      Srautus galima įsivaizduoti kaip konvejerį arba vamzdyną (pipeline),
      per kurį juda mūsų kolekcijos elementai ir tam tikrose vietose su tais elementais atliekamos tam tikros operacijos:
       - elementai keičiami (map),
       - atrenkami (filter),
       - rūšiuojami (sort) ir vėliau, jei reikia,
       - surenkami į konteinerį (collect)

      Srauto operaciją galima įsivaizduoti kaip veiksmą, kuris įėjime gauna vieną elementų rinkinį
      ir pagal kažkokias taisykles sugeneruoja išėjime kitų ar tų pačių elementų kitą rinkinį.

      Veiksmai gali būti vykdomi:
          - nuosekliai (vienas elementas po kito)
          - lygiagrečiai (keli elementai vienu metu)
      (demo2 package)


      Paprasčiausi būdai gauti srautą:
          - Arrays.stream(...)
          - kolekcija.stream()..., kolekcija.parallelStream()...
          - Stream.of(...)
          - IntStream, DoubleStream ....
          - new Random().ints(...)
      (demo3 package)


      Yra dviejų rūšių Streams operacijos:
          - tarpinė - jos rezultatas yra kitas srautas (filter, sort, map, reduce, ...)
          - galutinė - ji arba neturi rezultato (void) arba rezultatas nėra srautas (forEach, sum, ifPresent, ...)

      Operacijoms keliami šie reikalavimai:
          - neįsimenamos (stateless) - jos rezultatas nepriklauso nuo ankstesnių rezultatų
          - nesikišanti (non interference) - ji nemodifikuoja, t.y. nesikiša į pradinį srautą
          - be šalutinių poveikių (side-effects) - rezultatas nepriklauso nuo jokių kitų pašalinių aplinkybių
      *operacijos gali ir nesilaikyti šių reikalavimų, bet tada rezultatas gali būti nenusakomas.

      Streams gali būti:
          - sulygiuoti (ordered)
          - nelygiuoti (unordered) - rezultato tvarka gali būti bet kokia


      TARPINĖS operacijos:
          - filter (filtravimas) tarpinė operacija, kurios parametras Predicate funkcijos tipo;
          Praleidžiami tik tie srauto elementai, kuriems funkcija grąžina true
          - map - tarpinė operacija, kurios parametras Function tipo;
          Funkcija vykdoma kiekvienam srauto elementui ir grąžinamas naujas srautas
          - sorted - tarpinė operacija kuri lygiuoja srauto elementus
      (demo4 package)


       GALUTINĖS operacijos:
          - forEach - kiekvienam elementui atliekama funkcija
          - reduce - mažinimo galutinė operacija grąžinanti Optional
                1) reduce(BinaryOperatoraccumulator)
                2) reduce(identity,BinaryOperatoraccumulator)
                3) reduce(identity,BiFunctionaccumulator,BinaryOperatorcombiner)
                   *trečia forma veikia lygiagretaus srauto atveju. Kitu atveju ji reikia kaip antra
       (demo5 package)
          - collect - iš srauto sukuria kolekciją
                 Collectors.toList()
                 Collectors.toSet()
                 Collectors.toMap()
                 Collectors.groupingBy()
                 Collectors.reducing()
                 Collectors.mapping()
       (demo6 package)
 */
public class Streams {
    /*
         DVEJETAINIAI SRAUTAI (BINARY STREAMS)
         Naudojami kai mums nerūpi skaitomos/rašomos informacijos tipas,
         t.y. kai laikoma, kad visas informacija yra tik baitų (8 bitai: 0-255) seka ir, jei reikės, mes patys ją interpretuosim taip kaip mums reikia;

         - InputStream, OutputStream - abstrakčios klasės
         - FileInputStream, FileOutputStream
         (pvz žemiau:)
     */
    public static void main(String... args) {

        long startTime = System.nanoTime();

        try (
                InputStream in = new FileInputStream("src/main/java/lt/baltictalents/p20/java-iso-8859-13.txt");
                OutputStream out = new FileOutputStream("src/main/java/lt/baltictalents/p20/output.txt");
        ) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Laikas: " + (estimatedTime / 1e6) + "ms");
    }
}
/*
        TEKSTINIAI SRAUTAI (CHARACTER STREAMS) -
        tai dvejetainius įvedimo/išvedimo srautus naudojančios klasės,
        kurios skaitymo/rašymo metu dekoduoja/užkoduoja simbolius atsižvelgiant į nurodytas koduotes
        (arba pagal nustatytą programos standartinę koduotę - paprastai tai UTF-8).

        - Reader, Writer - abstrakčios klasės
        - FileReader, InputStreamReader - įvedimas
        - FileWriter, OutputStreamWriter - išvedimas
        (demo7 package)


        BUFERIZUOTAS SKAITYMAS/RAŠYMAS
        Anksčiau matytos klasės realizuoja tiesioginį skaitymą/rašymą,
        t.y. pvz. su kiekviena skaitymo operacija atitinkamos klasės objektas nuskaito iš failo ar kito šaltinio tik vieną simbolį - labai neefektyvu!!!

        - BufferedReader - įvedimas
        - BufferedWriter - išvedimas
        (demo8 package)

        Taip pat egzistuoja buferizuotos InputStream ir OutputStream versijos - atitinkamai BufferedInputStream ir BufferedOutputStream.
        (demo9 package)


        DUOMENŲ SRAUTAI (DATA STREAMS) -
        tai binariniai srautai skirti skaityti/rašyti primityvius duomenų tipus: int, short, byte, long, double, float, boolean, char, o taip pat ir String.

        Duomenų srautų klasės turi realizuoti atitinkamas sąsajas:
                - DataInput
                - DataOutput

        Klasės: DataInputStream, DataOutputStream;
        (demo10 package)


        OBJEKTŲ SRAUTAI (OBJECT STREAMS) - darbui su objektais.

        Objektų srautų klasės turi realizuoti atitinkamas sąsajas:
                - ObjectInput
                - ObjectOutput

        Klasės: ObjectInputStream, ObjectOutputStream;

        p.s Objektų skaitymas/rašymas nėra paprasta operacija, nes vienas objektas gali turėti savo viduje nuorodą į kitą/kitus objektus ir t.t.

 */
