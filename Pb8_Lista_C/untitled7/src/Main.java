public class Main {
    public static void main(String[] args) {
        // Definire nivel 0 arborescenta
        Structura structuraFarmacie = new Structura("Organigrama spital");
        Farmacie farmacie = new Farmacie(structuraFarmacie, "Farmacia Catena Inimii");

        // Definire noduri nivel 1 arborescenta (Sectiuni)
        ANod sectiune1 = new Structura("Medicamente ptr raceala");
        ANod sectiune2 = new Structura("Medicamente ptr durere");
        ANod sectiune3 = new Structura("Medicamente de tip Antibiotice");
        structuraFarmacie.adaugaNod(sectiune1);
        structuraFarmacie.adaugaNod(sectiune2);
        structuraFarmacie.adaugaNod(sectiune3);

        // Definire noduri nivel 2 arborescenta (Subsectiuni)
        sectiune1.adaugaNod(new Structura("-Pentru adulti"));
        sectiune1.adaugaNod(new Structura("-Pentru copii"));
        sectiune2.adaugaNod(new Structura("-Pentru adulti"));
        sectiune2.adaugaNod(new Structura("-Pentru copii"));
        sectiune3.adaugaNod(new Structura("-Pentru adulti"));
        sectiune3.adaugaNod(new Structura("-Pentru copii"));

        // Afisare structura Spital
        System.out.println(farmacie.getNumeFarmacie());
        System.out.println(structuraFarmacie.getInfo());
    }
}
