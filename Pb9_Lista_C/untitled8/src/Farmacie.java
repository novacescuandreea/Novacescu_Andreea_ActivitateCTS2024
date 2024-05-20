import java.util.ArrayList;
import java.util.List;

public class Farmacie implements IFarmacie {
    private List<Client> listaClienti;

    public Farmacie(List<Client> listaClienti) {
       this.listaClienti = new ArrayList<>(listaClienti);
    }

    @Override
    public boolean areReteta() {
        return false;
    }

    @Override
    public void cumpara() {
        System.out.println("Nu are reteta deci nu poate cumpara medicamente.");
    }

    @Override
    public void adaugareClient(Client client) {
        this.listaClienti.add(client);
        System.out.println("Clientul " + client+ " are reteta si a fost adaugat in baza de date");
    }
}