public class Main {
    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat(0);
        bancomat.executaStare();

        bancomat.setStare(new ArePinIntrodus());
        bancomat.executaStare();

        bancomat.setStare(new AreCard());
        bancomat.executaStare();
    }
}
