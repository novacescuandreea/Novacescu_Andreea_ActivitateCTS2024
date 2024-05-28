public class DecoratorFelicitare extends Decorator {
    public DecoratorFelicitare(NotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaNota() {
        super.printeazaNota();
        printeazaFelicitare();
    }

    private void printeazaFelicitare() {
        System.out.println("La mulți ani!");
    }
}