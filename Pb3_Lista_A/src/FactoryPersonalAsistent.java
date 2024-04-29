public class FactoryPersonalAsistent implements Factory{
    @Override
    public PersonalSpital crearePersonal(){
        return new PersonalAsistent();
    }
}