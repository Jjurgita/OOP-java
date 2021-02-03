package bit.obj.p11.p11U1;

public class Person {
    //1) Kintamieji:
    private String firstname;
    private String lastname;
    private String personID;
    //kadangi nežinome, ar ateityje/kitoje šalyje personID nebus/nėra raidžių, geriau naudoti String kintamojo tipą
    //BigInteger rekomenduojama naudoti, jeigu planuojama su jais atlikti aritmetinius veiksmus

    //2) Konstruktorius - konstruojam Person:
    public Person(String firstname, String lastname, String personID) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.personID = personID;
    }

    // Getter ir Setter - automatiškai:
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    // Perrasom Object toString method, kad galetume graziai atspausdinti i konsole Person object:
    @Override
    public String toString() {
        return firstname + "." + lastname + "." + " - "+ personID;
    }

}
