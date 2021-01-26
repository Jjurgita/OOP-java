package bit.obj.p06.notes.p06U2;

public class Player extends Group {
    private String firstname;

    public Player(int group, String firstname) {
        super(group);
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }
}
