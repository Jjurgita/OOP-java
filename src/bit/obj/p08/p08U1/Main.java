package bit.obj.p08.p08U1;
/*
        1) Sukurkite abstrakčią klasę Figura kurioje būtų aprašyti abstraktūs metodai plotui ir perimetrui paskaičiuoti.
        2) Sukurkite dukterines klases Apskritimas, Kvadratas, Trikampis (lygiakraštis).
        3) Paskaičiuokite kokie turėtų būti visų perimetrai, kad plotai būtų vienodi, tarkime lygūs 100.
        4) Paskaičiuokite kokie turėtų būti visų plotai, kad perimetrai būtų vienodi, tarkime lygūs 100.

        Pastaba: apsirašykite Figura klasėje tokius abstrakčius metodus ir po to juos aprašykite dukterinėse klasėse,
        kad kaip parametrą pateikus plotą arba perimetrą, jie paskaičiuotų ir nustatytų atitinkamos figūros kraštinę ar spindulį.
 */
public class Main {
    public static void main(String[] args) {

        Apskritimas a = new Apskritimas();
        a.setRadius(10);

        System.out.println("Apskritimas");
        System.out.println("Plotas: " + a.getArea());
        System.out.println("Perimetras: " + a.getParameter());
        System.out.println("-----------------------------------");

        Kvadratas k = new Kvadratas();
        k.setEdge(10);

        System.out.println("Kvadratas");
        System.out.println("Plotas: " + k.getArea());
        System.out.println("Perimetras: " + k.getParameter());
        System.out.println("-----------------------------------");

        Trikampis t = new Trikampis();
        t.setEdge(10);

        System.out.println("Trikampis");
        System.out.println("Plotas: " + t.getArea());
        System.out.println("Perimetras: " + t.getParameter());
        System.out.println("-----------------------------------");

        // 3) jeigu Plotas yra lygus 100:
        System.out.println("Apskritimo plotas = 100, tad perimetrai = " + a.parametersIfAreaIs100(100));
        System.out.println("Kvadrato plotas = 100, tad perimetrai = " + k.parametersIfAreaIs100(100));
        System.out.println("Trikampio plotas = 100, tad perimetrai = " + t.parametersIfAreaIs100(100));
        System.out.println("-----------------------------------");

        // 4) jeigu Parametrai yra lygūs 100:
        System.out.println("Apskritimo perimetrai = 100, tad plotas = " + a.areaIfParametersAre100(100));
        System.out.println("Kvadrato perimetrai = 100, tad plotas = " + k.areaIfParametersAre100(100));
        System.out.println("Trikampio perimetrai = 100, tad plotas = " + t.areaIfParametersAre100(100));

    }
}
