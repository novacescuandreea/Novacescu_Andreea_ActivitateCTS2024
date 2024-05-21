import java.util.ArrayList;
import java.util.List;

public class Farmacie implements INotificare{
    private List<Client> clienti;
    private String numeFarmacie;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
        this.clienti= new ArrayList<>();
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (Client client : clienti) {
            client.notificareOferte(mesaj);
        }
    }

    public void aboneazaClient(Client client) {
        clienti.add(client);
    }
}
