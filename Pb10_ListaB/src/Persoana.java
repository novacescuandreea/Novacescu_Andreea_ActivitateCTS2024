public class Persoana {
    private String nume;
    private String numarTelefon;
    private String adresaEmail;

    public Persoana(String nume, String numarTelefon, String adresaEmail) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresaEmail = adresaEmail;
    }

    public String getNume() {
        return nume;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public String getAdresaEmail() {
        return adresaEmail;
    }
}
