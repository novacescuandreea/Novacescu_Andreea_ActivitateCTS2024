public class RetetePreluate implements ICommand{

    private Reteta reteta;

    public RetetePreluate(Reteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void executa() {
        System.out.println("Reteta " + reteta.getNrReteta() + " a fost preluata.");
    }
}

