public class Main {
    public static void main(String[] args){
        MedicamenteFactory medicamenteFactory = new MedicamenteFactory();
        IMedicamente medicamente =null;
        try{
            medicamente = medicamenteFactory.creareMedicamente(EMedicamenteFarmacie.Raceala);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        medicamente.afisareDescriere();
    }
}
