public class Main {
    private static void afisare(Factory spital){
        PersonalSpital personalSpital = spital.crearePersonal();
        personalSpital.descriere();
    }

    public static void main(String[] args){
        afisare(new FactoryPersonalMedic());
    }
}