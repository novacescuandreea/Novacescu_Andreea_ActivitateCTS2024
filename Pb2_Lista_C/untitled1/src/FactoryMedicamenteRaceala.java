public class FactoryMedicamenteRaceala implements IFactory{
    @Override
    public IMedicamente creareMedicamente(){
        return new MedicamenteRaceala();
    }
}