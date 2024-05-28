public class FactoryPersoaneFizice implements IFactory{
     @Override
    public ITipPersoane creareTipPersoana() {
        return new PersoaneFizice();
    }
}