//composite
public class Main {
    public static void main(String[] args){
        Structura structura = new Structura("Meniu");
        Organigrama organigrama = new Organigrama(structura,"Organigrama");

        ANod structura1=new Structura("-Startere");
        ANod structura2=new Structura("-Bauturi");
        ANod structura3=new Structura("-Desert");

        structura.adauga(structura1);
        structura.adauga(structura2);
        structura.adauga(structura3);

        structura1.adauga(new Substructura("--Omleta", 10));
        structura1.adauga(new Substructura("--Cascaval pane", 20));
        structura2.adauga(new Substructura("--Apa", 5));
        structura2.adauga(new Substructura("--Ceai", 8));
        structura2.adauga(new Substructura("--Cafea", 10));
        structura3.adauga(new Substructura("--Ecler", 7));

        System.out.println(organigrama.getNumeOrganigrama());
        System.out.println(organigrama.getDescriere());
    }
}
