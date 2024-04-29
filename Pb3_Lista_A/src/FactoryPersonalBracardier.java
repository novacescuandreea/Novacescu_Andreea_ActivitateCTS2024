public class FactoryPersonalBracardier implements Factory{
    @Override
    public PersonalSpital crearePersonal(){
        return new PersonalBracardier();
    }
}