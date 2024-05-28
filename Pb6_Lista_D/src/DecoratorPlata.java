public class DecoratorPlata extends Decorator {
    public DecoratorPlata(ModalitatePlata modalitatePlata) {
        super(modalitatePlata);
    }

    @Override
    public void adaugaModalitatePlata() {
        super.adaugaModalitatePlata();
        adaugaModalitateContactless();
    }

    private void adaugaModalitateContactless() {
        System.out.println("Se adauga plata contactless");
    }
}