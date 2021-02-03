package bit.obj.p11.p11U2;

import java.util.Objects;

public class Address {
    private String miestas;
    private String gatve;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address adresas = (Address) o;
        return Objects.equals(miestas, adresas.miestas) && Objects.equals(gatve, adresas.gatve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(miestas, gatve);
    }
}
