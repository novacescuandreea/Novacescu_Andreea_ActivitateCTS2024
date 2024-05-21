public class Achizitionata implements State {
    @Override
    public void doAction(Reteta reteta) {
        System.out.println("Reteta " + reteta.getNumar() + " a fost cumparata de catre client");

    }
}
