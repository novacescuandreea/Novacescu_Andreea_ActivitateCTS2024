public class Main {
    public static void main(String[] args){
        Structura structura = new Structura("Stadion");
        Meniu meniu = new Meniu("Structura Stadion",structura);
        //L1
        ANod structuraStadion1 = new Structura("~Tribuna");
        ANod structuraStadion2 = new Structura("~Peluza");

        structura.adauga(structuraStadion1);
        structura.adauga(structuraStadion2);


        //L2
        structuraStadion1.adauga(new Substructura("-Tribuna Nord"));
        structuraStadion1.adauga(new Substructura("-Tribuna Sud"));
        structuraStadion1.adauga(new Substructura("-Tribuna Copii"));
        structuraStadion2.adauga( new Substructura("-Peluza Nord"));
        structuraStadion2.adauga( new Substructura("-Peluza Sud"));
        structuraStadion2.adauga( new Substructura("-Peluza Copii"));

        System.out.println(meniu.getNumeSubstructura());
        System.out.println(meniu.getDescriere());
    }
}
