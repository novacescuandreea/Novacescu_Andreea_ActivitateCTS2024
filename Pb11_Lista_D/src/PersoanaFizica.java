public class PersoanaFizica implements IStrategy {


    @Override
    public void verificareActe(String numeClient) {
        System.out.println("Se verifica buletinul si adeverinta de la munca pentru clientul " + numeClient + " persoana fizica.");
    }
}
