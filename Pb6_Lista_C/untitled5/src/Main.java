public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        Farmacist farmacist = new Farmacist(facade);

        Client client = new Client("Lungu George", "150388");
        String idMedicament = "Turbuhaler Symbicort";
        int numarDorite = 5;

        farmacist.proceseazaCerere(client, idMedicament, numarDorite);
    }
}
