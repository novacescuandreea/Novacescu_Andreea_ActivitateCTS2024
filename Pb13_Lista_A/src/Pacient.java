public class Pacient {
    private String nume;
    private State stare;

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

    public void setStare(State stare) {
        this.stare = stare;
    }
}
