public class StarePacient {
    private String nume;
    private long cnp;
    private String stareSanatate;

    public StarePacient(String nume, long cnp, String stareSanatate) {
        this.nume = nume;
        this.cnp = cnp;
        this.stareSanatate = stareSanatate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public String getStareSanatate() {
        return stareSanatate;
    }

    public void setStareSanatate(String stareSanatate) {
        this.stareSanatate = stareSanatate;
    }
}
