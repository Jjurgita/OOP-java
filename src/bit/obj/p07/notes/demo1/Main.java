package bit.obj.p07.notes.demo1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Viso žmonių " + People.getKiekis());

        People zmogus1 = new People("Adomas");
        System.out.println(zmogus1.pilnasVardas());

        People zmogus2 = new People("Ieva");
        System.out.println(zmogus2.pilnasVardas());

        System.out.println("Viso žmonių " + People.getKiekis());

        //Zmogus.kiekis++;

        System.out.println("Viso žmonių " + People.getKiekis());
    }
}
