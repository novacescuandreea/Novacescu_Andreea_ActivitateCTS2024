public class Pacient {
    private String nume;
    private int varsta;
    private String stare_sanatate;

    public Pacient(String nume, int varsta, String stare_sanatate) {
        this.nume = nume;
        this.varsta = varsta;
        this.stare_sanatate = stare_sanatate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getStare_sanatate() {
        return stare_sanatate;
    }

    public void setStare_sanatate(String stare_sanatate) {
        this.stare_sanatate = stare_sanatate;
    }

    public boolean verificaStareSanatate() {
        return stare_sanatate.equals("Grav");
    }

}
