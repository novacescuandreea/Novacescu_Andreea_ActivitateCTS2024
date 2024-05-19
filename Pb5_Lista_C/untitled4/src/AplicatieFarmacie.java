public class AplicatieFarmacie {

    private AdapterAplicatie adapter;

    public AplicatieFarmacie(AdapterAplicatie adapter) {
        this.adapter = adapter;
    }

    public void setareMedicament(String idMedicament) {
        adapter.setareMedicament(idMedicament);
    }

    public boolean verificareDisponibilitate(int numarDorite) {
        return adapter.verificareDisponibilitate(numarDorite);
    }

}
