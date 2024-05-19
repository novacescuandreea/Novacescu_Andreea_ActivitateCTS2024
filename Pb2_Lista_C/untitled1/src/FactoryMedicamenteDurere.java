public class FactoryMedicamenteDurere implements IFactory{
    @Override
    public IMedicamente creareMedicamente(){
        return new MedicamenteDurere();
    }
}
