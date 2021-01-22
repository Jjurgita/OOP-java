package p06;

import p05.Mokinys;
import p06.notes.prat1.Student;

public class P06U1 {
    public static void main(String[] args) {
        // Iš Student masyvo atspausdinti mokinių klasės numerį/vardus/pavardes su jų trimestro vidurkiu pagal klases vidurkio mažėjimo tvarka.

        Student[] students = new Student[] {
                new Student(2, "Jonas", "Kazys", new int[] {8, 9, 8, 10}),
                new Student(3, "Petras", "Petraitis", new int[] {6, 4, 8, 4}),
                new Student(1, "Antanas", "Antanaitis", new int[] {7, 7, 7, 10}),
                new Student(1, "Jurgis", "Jurgaitis", new int[] {8, 10, 10, 10}),
                new Student(3, "Juozas", "Juozaitis", new int[] {6, 9, 4, 7}),
                new Student(4, "Jone", "Jonaite", new int[] {9, 10, 8, 10}),
                new Student(2, "Ona", "Onute", new int[] {7, 6, 8, 5}),
                new Student(4, "Marija", "Petraite", new int[] {5, 6, 8, 10}),
                new Student(3, "Goda", "Godute", new int[] {7, 9, 8, 5})
        };
        System.out.println("DUOMENYS: ");
        print(students);

        // skirstom pagal klases/ vidurki mazejimo tvarka
        for (int i = 0; i < students.length - 1 ; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].level > students[j].level) {
                    Student tmp = students[i];
                    students[i] = students[j];
                    students[j] = tmp;
                }
                if (students[i].level >= students[j].level && students[i].average() <= students[j].average()) {
                    Student tmp = students[i];
                    students[i] = students[j];
                    students[j] = tmp;
                }
            }
        }
        System.out.println("DUOMENYS PO RŪŠIAVIMO: ");
        print(students);
    }

    static void print(Student[] students) {
        for (Student s : students) {
            System.out.println(s.level + " klase - " + s.firstname + " " + s.lastname + ". Vidurkis: " + s.average());
        }
    }
}
