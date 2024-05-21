public class Stoc {
    private String numeMed;
    private int nr;

    public Stoc(String numeMed, int nr) {
        this.numeMed = numeMed;
        this.nr = nr;
    }

    public String getNumeMed() {
        return numeMed;
    }

    public void setNumeMed(String numeMed) {
        this.numeMed = numeMed;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public boolean esteDisponibil(int cantitate) {
        return nr >= cantitate;
    }

    public void scadeCantitate(int cantitate) {
        if (esteDisponibil(cantitate)) {
            nr = nr - cantitate;
        } else {
            throw new IllegalArgumentException("Stoc insuficient pentru " + numeMed);
        }
    }

}
