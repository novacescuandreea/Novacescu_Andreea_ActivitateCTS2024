public class RetetePreluateViitor implements ICommand {
    private Reteta reteta;

    public RetetePreluateViitor(Reteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void executa() {
        System.out.println("Reteta " + reteta.getNrReteta() + " va fi preluata.");
    }
}
