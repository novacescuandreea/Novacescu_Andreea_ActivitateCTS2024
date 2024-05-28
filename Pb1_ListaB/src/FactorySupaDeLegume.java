public class FactorySupaDeLegume implements IFactory {

    @Override
    public ISupe creareSupe() {
        return new SupaDeLegume();
    }
}
