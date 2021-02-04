package bit.obj.p11.p11U2.notes_Set;

import java.util.Objects;

public class Address implements Comparable<Address> {
    private String miestas;
    private String gatve;

    /*
    Comparatoriai skirti palyginti du objektus;
    Visi Comparatoriai grąžina int

    if  (this < o) return -x
    if (this == o) return 0
    if (this > o) return +x
     */
    @Override
    public int compareTo(Address o) { //lyginam this su o
        int c = this.miestas.compareTo(o.miestas);
        if (c != 0) return c;
        return this.gatve.compareTo(o.gatve);
    }

    public Address(String miestas, String gatve) {
        this.miestas = miestas;
        this.gatve = gatve;
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
