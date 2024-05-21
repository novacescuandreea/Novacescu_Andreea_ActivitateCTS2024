public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(5);
        reteta.executaStare();

        reteta.setStare(new Emisa());
        reteta.executaStare();

        reteta.setStare(new Solicitata());
        reteta.executaStare();
    }
}
