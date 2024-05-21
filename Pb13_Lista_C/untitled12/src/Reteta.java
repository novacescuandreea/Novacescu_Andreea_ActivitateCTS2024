public class Reteta {
    private int numar;
    private State stare;

    public Reteta(int numar) {
        this.numar = numar;
        this.stare = new Achizitionata();
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public void executaStare() {
        stare.doAction(this);
    }

    public void setStare(State stare) {
        this.stare = stare;
    }
}
