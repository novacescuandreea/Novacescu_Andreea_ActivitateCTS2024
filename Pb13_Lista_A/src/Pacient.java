public class Pacient {
    private String nume;
    private Stare stare;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new Internat();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void executaStare() {
        stare.doAction(this);
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }
}
