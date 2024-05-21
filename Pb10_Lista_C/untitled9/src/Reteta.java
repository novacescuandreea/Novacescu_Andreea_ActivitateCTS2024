public class Reteta {
    private Client client;
    private int nrReteta;
    private int sumaPlata;
    private int nrMedicamente;

    public Reteta(Client client, int nrReteta, int sumaPlata, int nrMedicamente) {
        this.client = client;
        this.nrReteta = nrReteta;
        this.sumaPlata = sumaPlata;
        this.nrMedicamente = nrMedicamente;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public void setNrReteta(int nrReteta) {
        this.nrReteta = nrReteta;
    }

    public int getSumaPlata() {
        return sumaPlata;
    }

    public void setSumaPlata(int sumaPlata) {
        this.sumaPlata = sumaPlata;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    public void setNrMedicamente(int nrMedicamente) {
        this.nrMedicamente = nrMedicamente;
    }

    public void descrieClient() {
        System.out.println("Reteta: " + nrReteta);
        System.out.println("Suma de plata: " + sumaPlata);
        System.out.println("Numar de medicamente: " + nrMedicamente);
        System.out.println("Client: " + client.getNume());
        System.out.println("Numar de telefon" + client.getNumarTelefon());
        System.out.println("Adresa client" + client.getAdresa());
        System.out.println("Numar asigurare" + client.getNrAsigurare());
    }
}
