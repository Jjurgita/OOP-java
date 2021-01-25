package bit.obj.p06.notes.prat1;

public class StudentTrimester {
    public static void main(String[] args) {
        // Tarkime Mokinys klasės trimestras laukas turi kažkokias reikšmes (masyvą sveikų skaičių), pvz.: {8,9,8,10}
        // Parašykite klasei Mokinys metodą kuris grąžintų trimestro vidurkį kaip skaičių su kableliu, t.y. duotu atveju grąžintų 8.75
        // Atspausdinkite mokinių vardus, pavardes ir vidurkius.

//        Student students = new Student("Jonas", "Senukas", new int[] {8, 9, 8, 10});
        Student[] students = new Student[] {
                new Student(2, "Jonas", "Kazys", new int[] {8, 9, 8, 10}),
                new Student(3, "Petras", "Petraitis", new int[] {6, 6, 8, 4}),
                new Student(1, "Antanas", "Antanaitis", new int[] {7, 7, 7, 10}),
                new Student(1, "Jurgis", "Jurgaitis", new int[] {8, 10, 10, 10}),
                new Student(2, "Juozas", "Juozaitis", new int[] {6, 9, 4, 7}),
                new Student(4, "Jone", "Jonaite", new int[] {8, 10, 8, 10}),
                new Student(2, "Ona", "Onute", new int[] {7, 6, 8, 5}),
                new Student(4, "Marija", "Petraite", new int[] {8, 6, 8, 10}),
                new Student(3, "Goda", "Godute", new int[] {7, 9, 7, 5})
        };

        for (Student s : students) {
            System.out.println(s.firstname + " " + s.lastname + " " + s.average());
        }

    }
}
