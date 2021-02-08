package bit.obj.p16.importingCSV;

import java.util.List;

public class FirmaMain {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.err.println("Neteisingas argumentu skaicius - butina nurodyti viena failo varda");
            return;
        }
        System.out.println("Failas " + args[0]);
        IFirmaService firmaService = new FirmaService();

        List<Firma> firmos = firmaService.read(args[0]);

        //galima naudoti for arba forEach:
        for (Firma firma : firmos) {
            System.out.println(firma.getId() + " " + firma.getTitle() + " " +
                    firma.getDate() + " " + firma.getQuantity() + " " + firma.getPrice());
        }
//        firmos.forEach(firma ->
//            System.out.println(firma.getId() + " " + firma.getName() + " " +
//                    firma.getDate() + " " + firma.getQty() + " " + firma.getPrice())
//        );
    }
}
