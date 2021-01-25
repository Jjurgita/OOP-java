package bit.obj.p06.notes.prat1;

public class Student {
    public int level;
    public String firstname;
    public String lastname;
    public int[] marks;

    public Student (int level, String firstname, String lastname, int[] marks) {
        this.level = level;
        this.firstname = firstname;
        this.lastname = lastname;
        this.marks = marks;
    }

    public double average(){
        if (marks == null) return 0;
        int sum = 0;
        for (int i : marks) {
            sum += i;
        }
        return (double)sum / marks.length;
    }

}
