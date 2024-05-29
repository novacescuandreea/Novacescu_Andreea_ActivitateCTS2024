public class Main {
    public static void main(String[] args){
        Structura structura = new Structura("Banca");
        Meniu meniu = new Meniu("Structura Banca",structura);
        //L1
        ANod structuraAgentie1 = new Structura("~Agentie 1");
        ANod structuraAgentie2 = new Structura("~Agentie 2");
        ANod structuraAgentie3 = new Structura("~Agentie 3");

        structura.adauga(structuraAgentie1);
        structura.adauga(structuraAgentie2);
        structura.adauga(structuraAgentie3);

        //L2
        structuraAgentie1.adauga(new Produs("-Filiala 1"));
        structuraAgentie1.adauga(new Produs("-Filiala 2"));
        structuraAgentie2.adauga( new Produs("-Filiala 1"));
        structuraAgentie2.adauga( new Produs("-Filiala 2"));
        structuraAgentie3.adauga(new Structura("-Filiala 1"));


        System.out.println(meniu.getNumeRestaurant());
        System.out.println(meniu.getDescriere());
    }
}
