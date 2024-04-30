public abstract class DecoratorRezultate extends Rezultate {
    protected Rezultate rezultate;

    public DecoratorRezultate(Rezultate rezultate) {
        super();
        this.rezultate = rezultate;
    }

    @Override
    public int getID() {
        return rezultate.getID()+5;
    }

    public void afiseazaRezultate() {
        rezultate.afiseazaRezultate();
    }


}
