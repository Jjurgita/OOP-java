package bit.obj.p05.inheritance;

public class BendraInfo {
    private String vardas;  // private / public / protected / ... /
    private String pavarde;
    private String ak;
    private String telefonas;
    private String email;
    Adresas adresas;


    public BendraInfo() {
        System.out.println("Bendri()");
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public String getTelefonas() {
        return telefonas;
    }

    public void setTelefonas(String telefonas) {
        this.telefonas = telefonas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Adresas getAdresas() {
        return adresas;
    }

    public void setAdresas(Adresas adresas) {
        this.adresas = adresas;
    }
}
