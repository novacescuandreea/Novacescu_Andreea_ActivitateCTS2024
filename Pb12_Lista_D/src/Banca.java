import java.util.ArrayList;
import java.util.List;

public class Banca implements INotificare{

    private List<Clienti> clienti;
    private String numeBanca;

    public Banca(String numeBanca) {
        this.numeBanca = numeBanca;
        this.clienti = new ArrayList<>();
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (Clienti client : clienti) {
            client.notificareOferte(mesaj);
        }
    }

    public void aboneazaClient(Clienti client) {
        clienti.add(client);
    }
}
