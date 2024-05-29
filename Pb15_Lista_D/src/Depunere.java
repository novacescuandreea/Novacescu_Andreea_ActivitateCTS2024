public class Depunere implements ICommand {
    private Cont cont;
    private double suma;

    public Depunere(Cont cont, double suma) {
        this.cont = cont;
        this.suma = suma;
    }

    @Override
    public void executa() {
        cont.depunere(suma);
    }

    @Override
    public void undo() {
        cont.retragere(suma);
    }
}