public class PersoanaJuridica implements IStrategy {


    @Override
    public void verificareActe(String numeClient) {
        System.out.println("Se verifica actele de infiintare a firmei si dovada inregistrarii la Registrul Comertului pentru clientul " + numeClient + " persoana juridica.");
    }
}