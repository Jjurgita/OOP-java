package bit.obj.p16.streams;
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

 }
