public class Restaurant {
    private int nrID;
    private Client client;

    public Restaurant(int nrID, Client client) {
        this.nrID = nrID;
        this.client = client;
    }

    public int getNrID() {
        return nrID;
    }

    public void setNrID(int nrID) {
        this.nrID = nrID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void descrieClient() {
        System.out.println("Client: " + client.getNume());
        System.out.println("Numar telefon: " + client.getNumar());
        System.out.println("Adresa: " + client.getAdresa());
        System.out.println();
    }
}
