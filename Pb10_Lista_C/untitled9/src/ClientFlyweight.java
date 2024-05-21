import java.util.HashMap;

public class ClientFlyweight implements IFlyweight {
    private final HashMap<String, Client> clienti = new HashMap<>();

    @Override
    public Client getClient(String nume, long numarTelefon, String adresa, int nrAsigurare) {
        String key = nume;
        Client client = clienti.get(key);

        if (client == null) {
            client = new Client(nume, numarTelefon, adresa, nrAsigurare);
            clienti.put(key, client);
        }

        return client;
    }
}
