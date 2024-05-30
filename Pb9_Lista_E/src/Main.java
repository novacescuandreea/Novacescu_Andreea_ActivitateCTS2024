public class Main {
    public static void main(String[] args){
        Structura structura = new Structura("Flota");
        Meniu meniu = new Meniu("Structura flota",structura);
        //L1
        ANod structuraStadion1 = new Structura("~Producator A");
        ANod structuraStadion2 = new Structura("~Producator B");
        ANod structuraStadion3 = new Structura("~Producator C");

        structura.adauga(structuraStadion1);
        structura.adauga(structuraStadion2);
        structura.adauga(structuraStadion3);

        //L2
        structuraStadion1.adauga(new Substructura("-Grupuri mici"));
        structuraStadion1.adauga(new Substructura("-Grupuri medii"));
        structuraStadion1.adauga(new Substructura("-Grupuri mari"));
        structuraStadion2.adauga( new Substructura("-Grupuri mici"));
        structuraStadion2.adauga( new Substructura("-Grupuri medii"));
        structuraStadion2.adauga( new Substructura("-Grupuri mari"));
        structuraStadion3.adauga( new Substructura("-Grupuri mici"));
        structuraStadion3.adauga( new Substructura("-Grupuri medii"));
        structuraStadion3.adauga( new Substructura("-Grupuri mari"));

        System.out.println(meniu.getNumeSubstructura());
        System.out.println(meniu.getDescriere());
    }
}
