public class Client {
    private String nume;
    private long numarTelefon;
    private String adresa;
    private int nrAsigurare;

    public Client(String nume, long numarTelefon, String adresa, int nrAsigurare) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
        this.nrAsigurare = this.nrAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public long getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(long numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getNrAsigurare() {
        return nrAsigurare;
    }

    public void setNrAsigurare(int nrAsigurare) {
        this.nrAsigurare = nrAsigurare;
    }
}
