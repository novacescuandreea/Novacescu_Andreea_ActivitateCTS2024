public class FactoryPersoaneJuridice implements IFactory {
    @Override
    public ITipPersoane creareTipPersoana() {
        return new PersoaneJuridice();
    }
}