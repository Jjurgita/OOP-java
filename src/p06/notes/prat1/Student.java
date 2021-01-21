package p06.notes.prat1;

public class Student {
    String firstname;
    String lastname;
    int[] marks;

    Student (String firstname, String lastname, int[] marks) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.marks = marks;
    }

    double average(){
        if (marks == null) return 0;
        int sum = 0;
        for (int i : marks) {
            sum += i;
        }
        return (double)sum / marks.length;
    }

}
