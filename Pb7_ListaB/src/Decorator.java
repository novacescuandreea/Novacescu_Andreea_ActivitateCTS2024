public abstract class Decorator extends NotaDePlata {
    protected NotaDePlata notaDePlata;

    public Decorator(NotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeazaNota() {
        notaDePlata.printeazaNota();
    }
}