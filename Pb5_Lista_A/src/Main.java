public class Main {
    public static void main(String[] args) {

        MedicamentSpital medicamentSpital = new MedicamentSpital();
        medicamentSpital.achizitioneazaMedicament();
        medicamentSpital.prezintaReteta();


        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie();
        medicamentFarmacie.prezintaReteta();
        medicamentFarmacie.cumparaMedicament();

    }
}