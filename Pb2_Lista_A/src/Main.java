public class Main {
    public static void main(String[] args){
        SpitalFactory spitalFactory = new SpitalFactory();
        ISpital spital =null;
        try{
            spital = spitalFactory.creareSpital(EPersonalSpital.Medic);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        spital.afisareDescriere();
    }
}