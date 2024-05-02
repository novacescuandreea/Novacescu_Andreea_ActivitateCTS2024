public class Pacient {
    private String nume;
    private long numar;
    private String adresa;

    public Pacient(String nume, long numar, String adresa) {
        this.nume = nume;
        this.numar = numar;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public long getNumar() {
        return numar;
    }

    public void setNumar(long numar) {
        this.numar = numar;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
