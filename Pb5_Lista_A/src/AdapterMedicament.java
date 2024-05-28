public class AdapterMedicament implements IMedicament{
    private MedicamentSpital medicamentSpital;

    public AdapterMedicament(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    public void achizitioneazaMedicament() {
          medicamentSpital.achizitioneazaMedicament();
        }

    @Override
    public void prezintaReteta() {
        medicamentSpital.prezintaReteta();
    }
}


