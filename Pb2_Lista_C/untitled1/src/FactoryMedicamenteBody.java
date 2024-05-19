public class FactoryMedicamenteBody implements IFactory{
    @Override
    public IMedicamente creareMedicamente(){
        return new MedicamenteBody();
    }
}
