import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Client> listaClienti = new ArrayList<>();
        Client client1 = new Client(true);
        Client client2 = new Client(false);
        Client client3 = new Client(true);

        listaClienti.add(client1);
        listaClienti.add(client2);

        Farmacie farmacie = new Farmacie(listaClienti);
        farmacie.adaugareClient(client1);

        ProxyFarmacie proxyFarmacie = new ProxyFarmacie(farmacie);
        proxyFarmacie.adaugareClient(client2);
        proxyFarmacie.adaugareClient(client3);

    }
 }

