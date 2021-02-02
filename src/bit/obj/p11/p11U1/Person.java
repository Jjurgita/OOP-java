package bit.obj.p11.p11U1;

import java.math.BigInteger;

public class Person {
    //1) Kintamieji:
    private String firstname;
    private String lastname;
    private BigInteger personID;

    //2) Konstruktorius - konstruojam Person:
    public Person(String firstname, String lastname, BigInteger personID) {
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

    public BigInteger getPersonID() {
        return personID;
    }

    public void setPersonID(BigInteger personID) {
        this.personID = personID;
    }

    // Perrasom Object toString method, kad galetume graziai atspausdinti i konsole Person object:
    @Override
    public String toString() {
        return firstname + "." + lastname + "." + " - "+ personID;
    }
}
