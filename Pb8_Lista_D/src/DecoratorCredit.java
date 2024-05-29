public class DecoratorCredit extends Decorator {
    public DecoratorCredit(CreareCont creareCont) {
        super(creareCont);
    }

    @Override
    public void adaugaCreareCont() {
        verificareMoneda();
        super.adaugaCreareCont();
    }

    private void verificareMoneda() {
        System.out.println("Verificare moneda");
        }
}