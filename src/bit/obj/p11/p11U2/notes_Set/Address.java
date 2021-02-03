package bit.obj.p11.p11U2.notes_Set;

import bit.obj.p05.inheritance.mokykla.Adresas;
import bit.obj.p14.generics.A;

import java.util.Objects;

public class Address implements Comparable<Address>{
    private int id;
    private String miestas;
    private String gatve;

    @Override
    public int compareTo(Address o) {
        if(id>o.id){
            return 1;
        }else if(id<o.id){
            return -1;
        }else{
            return 0;
        }
    }

    public Address(int id, String miestas, String gatve) {
        this.id = id;
        this.miestas = miestas;
        this.gatve = gatve;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }

    public String getGatve() {
        return gatve;
    }

    public void setGatve(String gatve) {
        this.gatve = gatve;
    }

    @Override
    public String toString() {
        return miestas + ' ' + gatve;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Address adresas = (Address) obj;
        return Objects.equals(miestas, adresas.miestas) && Objects.equals(gatve, adresas.gatve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(miestas, gatve);
    }



}
