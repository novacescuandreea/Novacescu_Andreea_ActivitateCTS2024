public class Meniu {
    private String numeSubstructura;
    private Structura structura;

    public Meniu(String numeSubstructura, Structura structura) {
        this.numeSubstructura = numeSubstructura;
        this.structura = structura;
    }

    public String getNumeSubstructura() {
        return numeSubstructura;
    }

    public void setNumeSubstructura(String numeSubstructura) {
        this.numeSubstructura = numeSubstructura;
    }

    public String getDescriere(){
        return structura.getDescriere();
    }

}
