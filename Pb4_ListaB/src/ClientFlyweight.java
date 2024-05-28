import java.util.HashMap;

public class ClientFlyweight implements IFlyweight {
    private final HashMap<String, Client> clienti = new HashMap<>();

    @Override
    public Client getClient(String nume, long numar, String adresa) {
        String key = nume + " " + numar;
        Client client = clienti.get(key);

        if (client == null) {
            client = new Client(nume, numar, adresa);
            clienti.put(key, client);
        }

        return client;
    }
}