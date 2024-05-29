public class Meniu {
    private String numeRestaurant;
    private Structura structura;

    public Meniu(String numeRestaurant, Structura structura) {
        this.numeRestaurant = numeRestaurant;
        this.structura = structura;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public String getDescriere(){
        return structura.getDescriere();
    }
}
