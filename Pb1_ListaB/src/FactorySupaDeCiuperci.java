public class FactorySupaDeCiuperci implements IFactory {

    @Override
    public ISupe creareSupe() {
        return new SupaDeCiuperci();
    }
}
