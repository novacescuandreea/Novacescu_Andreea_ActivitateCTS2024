public class Solicitata implements State {
    @Override
    public void doAction(Reteta reteta) {
        System.out.println("Reteta " + reteta.getNumar() + " a fost solicitata de catre client");

    }
}
