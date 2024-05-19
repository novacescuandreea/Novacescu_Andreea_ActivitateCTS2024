public class Farmacist {
    private Facade facade;

    public Farmacist(Facade facade) {
        this.facade = facade;
    }

    public void proceseazaCerere(Client client, String idMedicament, int numarDorite) {
        boolean verificareReusita = facade.verificaTot(client, idMedicament, numarDorite);
        if (verificareReusita) {
            System.out.println("Verificari realizate cu succes. Se continua cu vanzarea.");
        } else {
            System.out.println("Nu se continua cu vanzarea");
        }
    }
}
