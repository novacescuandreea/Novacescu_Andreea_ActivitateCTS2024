public class AdapterMedicament{
    private MedicamentSpital medicamentSpital;

    public AdapterMedicament(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }

}


