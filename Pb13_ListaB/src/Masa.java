public class Masa {
    private String nume;
    private State stare;

    public Masa(String nume) {
        this.nume = nume;
        this.stare = new Libera();
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
