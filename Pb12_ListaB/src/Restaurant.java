import java.util.ArrayList;
import java.util.List;

public class Restaurant implements INotificare{
    private List<Client> clienti;
    private String numeRestaurant;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.clienti = new ArrayList<>();
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (Client pacient : clienti) {
            pacient.notificareOferte(mesaj);
        }
    }

    public void aboneazaClient(Client client) {
        clienti.add(client);
    }


}
