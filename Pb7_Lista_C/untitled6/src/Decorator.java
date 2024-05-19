public abstract class Decorator extends BonDeCasa {
    protected BonDeCasa bonDeCasa;

    public Decorator(BonDeCasa bonDeCasa) {
        this.bonDeCasa = bonDeCasa;
    }

    @Override
    public void printareBon() {
        bonDeCasa.printareBon();
    }
}
