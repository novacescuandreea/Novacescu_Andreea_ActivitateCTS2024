//Factory Method
public class Main {
    private static void afisare(IFactory banca){
        ITipPersoane tipPersoane = banca.creareTipPersoana();
        tipPersoane.descriere();
    }

    public static void main(String[] args){
        afisare(new FactoryPersoaneFizice());
    }
}
