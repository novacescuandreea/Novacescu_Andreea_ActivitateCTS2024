public class Emisa implements State {
    @Override
    public void doAction(Reteta reteta) {
        System.out.println("Reteta " + reteta.getNumar() + " a fost emisa pentru client");

    }
}
