public class Main {
    public static void main(String[] args) {
        Cont cont = new Cont();

        ComenziOperator operator = new ComenziOperator();

        operator.executaComanda(new ConstituireCont(cont));
        operator.executaComanda(new Depunere(cont, 500));
        operator.executaComanda(new Retragere(cont, 200));

        operator.undo();
    }
}
