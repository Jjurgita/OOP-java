package bit.obj.p12;

public class NestedClass {
    /*
            GALUTINĖ REIKŠMĖ
            Jeigu norim pabrėžti, kad klasės lauko, kintamojo arba metodo parametro reikšmės negalima pakeisti,
            tai reikia prie kintamojo aprašo arba metodo parametro nurodyti modifikatorių final:

            void method(final int a) {
                ...
            }
            final double pi = 3.1415926536;
     */
    /*
            GALUTINIS METODAS
            Paprastai dukterinėje klasėje (subklasėje) galima iš naujo aprašyti (realizuoti) metodą, kuris egzistuoja tėvynėje klasėje (superklasėje)
            Bet jei mes esame tos superklasės autorius ir nenorime, kad mūsų metodas būtų realizuotas kitaip bet kurioje subklasėje,
            tai mes tokį metodą galima pažymėti modifikatoriumi final ir jo nebus galima pakeisti

            class A {
                int methodA(...) {...}
                final void methodB(...) { ... }
            }
     */
    /*
            GALUTINĖ KLASĖ
            Būna taip, kad mes aplamai nenorime ne tik kad metodas būtų perrašytas, bet ir visa klasė praplėsta,
            t.y. norime uždrausti iš mūsų klasės kurti dukterines klases. Tokiu atveju klasę reikia pažymėti modifikatoriumi final

            final class A {
                ...
            }
     */
    /*
            KONSTANTĖS
            Jei mes norime apsirašyti konstantas, t.y. tokius kintamuosius, kurių reikšmės niekada nesikeičia ir prie jų galima prieiti nekuriant jokių abjektų,
            tai geriausia tai padaryti kombinuojant modifikatorius static ir final

            class Const {
                static final double PI = 3.1415926536;
                static final String VERSION = “1.2”;
            }
            double area = r * r * Const.PI;
     */
}
