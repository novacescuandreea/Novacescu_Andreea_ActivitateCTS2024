public abstract class Client implements Cloneable {
    private String nume;
    private String adresa;

    public Client(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}