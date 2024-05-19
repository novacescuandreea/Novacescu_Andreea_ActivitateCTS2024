public class Main {

    public static void main(String[] args) {
        AplicatieNoua aplicatieNoua = new AplicatieNoua();
        AdapterAplicatie adapter = new AdapterAplicatie(aplicatieNoua);
        AplicatieFarmacie aplicatieFarmacie = new AplicatieFarmacie(adapter);

        aplicatieFarmacie.setareMedicament("Turbuhaler Symbicort");
        boolean disponibil = aplicatieFarmacie.verificareDisponibilitate(10);

        System.out.println("Medicament disponibil: " + disponibil);
    }
}
