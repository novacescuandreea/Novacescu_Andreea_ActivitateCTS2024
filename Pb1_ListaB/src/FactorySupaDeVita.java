public class FactorySupaDeVita implements IFactory {

    @Override
    public ISupe creareSupe() {
        return new SupaDeVita();
    }
}
