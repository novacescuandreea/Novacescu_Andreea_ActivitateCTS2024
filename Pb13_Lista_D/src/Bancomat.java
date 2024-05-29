public class Bancomat {
    private int numar;
    private IState stare;

    public Bancomat(int numar) {
        this.numar = numar;
        this.stare = new NuAreCard();
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

    public void setStare(IState stare) {
        this.stare = stare;
    }
}
