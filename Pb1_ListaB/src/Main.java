public class Main {
    private static void afisare(IFactory medicamente){
        ISupe iSupe = medicamente.creareSupe();
        iSupe.descriere();
    }

    public static void main(String[] args){
        afisare(new FactorySupaDeVita());
    }
}
