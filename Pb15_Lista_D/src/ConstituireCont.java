public class ConstituireCont implements ICommand {
    private Cont cont;

    public ConstituireCont(Cont cont) {
        this.cont = cont;
    }

    @Override
    public void executa() {
        cont.constituire();
    }

    @Override
    public void undo() {
        cont.anulareConstituire();
    }
}