public class Retragere implements ICommand {
    private Cont cont;
    private double suma;

    public Retragere(Cont cont, double suma) {
        this.cont = cont;
        this.suma = suma;
    }

    @Override
    public void executa() {
        cont.retragere(suma);
    }

    @Override
    public void undo() {
        cont.depunere(suma);
    }
}