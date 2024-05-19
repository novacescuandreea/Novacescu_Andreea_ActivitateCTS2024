public class Main {
    private static void afisare(IFactory medicamente){
        IMedicamente imedicamente = medicamente.creareMedicamente();
        imedicamente.descriere();
    }

    public static void main(String[] args){
        afisare(new FactoryMedicamenteDurere());
    }
}
