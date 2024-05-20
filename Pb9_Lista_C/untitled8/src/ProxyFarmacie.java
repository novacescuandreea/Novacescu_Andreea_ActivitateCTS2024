public class ProxyFarmacie implements IFarmacie {
    private Farmacie farmacie;

    public ProxyFarmacie(Farmacie farmacie) {
        super();
        this.farmacie = farmacie;
    }

    @Override
    public boolean areReteta() {
        return false;
    }

    public void cumpara() {
       this.farmacie.cumpara();
    }

    @Override
    public void adaugareClient(Client client) {
        if(client.areReteta())
            farmacie.adaugareClient(client);
        else
            System.out.println("Clientul "+client + " nu are reteta, deci nu poate cumpara medicamente.");
    }

}
