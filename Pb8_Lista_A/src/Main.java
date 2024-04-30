public class Main {
    public static void main(String[] args) {
        // Definire nivel 0 arborescenta
        Structura structuraSpital = new Structura("Spital CFR");

        // Definire noduri nivel 1 arborescenta
        ANod departamentInterne = new Structura("Interne");
        ANod subdepartamentPediatrie = new Structura("Pediatrie");

        structuraSpital.adaugaNod(departamentInterne);
        structuraSpital.adaugaNod(subdepartamentPediatrie);

        // Definire noduri nivel 2 arborescenta (Sectii)
        ANod sectieGinecologie = new Sectii("Ginecologie");
        ANod sectiePsihologie = new Sectii("Psihologie");

        ((Structura) departamentInterne).adaugaNod(sectieGinecologie);
        ((Structura) subdepartamentPediatrie).adaugaNod(sectiePsihologie);

        // Afisare structura Spital
        System.out.println(structuraSpital.getInfo());
    }
}