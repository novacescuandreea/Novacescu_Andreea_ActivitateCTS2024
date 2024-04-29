public class FactoryPersonalMedic implements Factory {
    @Override
    public PersonalSpital crearePersonal () {
        return new PersonalMedic();
    }
}