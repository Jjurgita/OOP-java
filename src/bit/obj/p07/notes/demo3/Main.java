package bit.obj.p07.notes.demo3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Apskritimo su spinduliu " + 123 + " plotas yra " + Area.circle(123));
        System.out.println("Lygiagraščio trikampio su kraštine " + 123 + " plotas yra " + Area.triangle(123, 123, 123));
        System.out.println("Kvadrato su kraštine " + 123 + " plotas yra " + Area.square(123));
    }
}
