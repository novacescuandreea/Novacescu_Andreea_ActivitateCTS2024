public class Banca {private String nume;
    private String sucursala;
    private double capital;

    // Constructor, getteri și setteri
    public Banca(String nume, String sucursala, double capital) {
        this.nume = nume;
        this.sucursala = sucursala;
        this.capital = capital;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSucursala() {
        return sucursala;
    }

    public void setSucursala(String sucursala) {
        this.sucursala = sucursala;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

}
