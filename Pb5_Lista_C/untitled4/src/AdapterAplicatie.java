public class AdapterAplicatie implements IAplicatie{
    private AplicatieNoua aplicatieNoua;
    private String idMedicamentCurent;

    public AdapterAplicatie(AplicatieNoua aplicatieNoua) {
        this.aplicatieNoua = aplicatieNoua;
    }

    public void setareMedicament(String idMedicament) {
        this.idMedicamentCurent = idMedicament;
        System.out.println("S-a primit id-ul medicamentului solicitat: " + idMedicament);
    }

    public boolean verificareDisponibilitate(int numarDorite) {
        return aplicatieNoua.verificaStocPentruMedicament(idMedicamentCurent, numarDorite);
    }

    @Override
    public void verificaStocPentruMedicament() {
        aplicatieNoua.verificaStocPentruMedicament(idMedicamentCurent,2);
    }
}
