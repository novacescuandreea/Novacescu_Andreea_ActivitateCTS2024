public class Main {
    public static void main(String[] args) {
        // Definire nivel 0 arborescenta
        Structura structuraSpital = new Structura("Organigrama spital");
        Spital spital = new Spital(structuraSpital, "Spital CFR");

        // Definire noduri nivel 1 arborescenta (Dep)
        ANod departamentInterne = new Structura("Interne");
        ANod departamentOrtopedie = new Structura("Ortopedie");
        ANod departamentStatistica = new Structura("Statistica");
        structuraSpital.adaugaNod(departamentInterne);
        structuraSpital.adaugaNod(departamentOrtopedie);
        structuraSpital.adaugaNod(departamentStatistica);

        // Definire noduri nivel 2 arborescenta (Sub)
        departamentInterne.adaugaNod(new Structura("Interne Pediatrica"));
        departamentOrtopedie.adaugaNod(new Structura("Ortopedie Pediatrica"));

        // Afisare structura Spital
        System.out.println(spital.getNumeSpital());
        System.out.println(structuraSpital.getInfo());
    }
}