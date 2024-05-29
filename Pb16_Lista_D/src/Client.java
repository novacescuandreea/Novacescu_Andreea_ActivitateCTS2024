import java.util.List;

public class Client {
    private String nume;
    private List<Cont> conturi;
    private IStrategy strategieOrdineConturi;

    public Client(String nume, List<Cont> conturi) {
        this.nume = nume;
        this.conturi = conturi;
    }

    public void setStrategieOrdineConturi(IStrategy strategieOrdineConturi) {
        this.strategieOrdineConturi = strategieOrdineConturi;
    }

    public boolean realizeazaPlata(double suma) {
        if (strategieOrdineConturi == null) {
            System.out.println("Vă rugăm să setați o strategie de ordonare a conturilor.");
            return false;
        }

        List<Cont> conturiOrdonate = strategieOrdineConturi.ordonareConturi(conturi);

        for (Cont cont : conturiOrdonate) {
            if (cont.getSold() >= suma) {
                cont.retrage(suma);
                return true; }
        }

        return false;
    }
}
