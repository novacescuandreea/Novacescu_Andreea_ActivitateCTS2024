public class Facade {
    private Reteta verificareReteta;
    private Stoc verificareStoc;
    private CardSanatate verificareCardSanatate;

    public Facade() {
        this.verificareReteta = new Reteta();
        this.verificareStoc = new Stoc();
        this.verificareCardSanatate = new CardSanatate();
    }

    public boolean verificaTot(Client client, String idMedicament, int numarDorite) {
        boolean retetaValida = verificareReteta.verificaReteta(client);
        boolean stocDisponibil = verificareStoc.verificaStoc(idMedicament, numarDorite);
        boolean cardValid = verificareCardSanatate.verificaCardSanatate(client);

        return retetaValida && stocDisponibil && cardValid;
    }
}
