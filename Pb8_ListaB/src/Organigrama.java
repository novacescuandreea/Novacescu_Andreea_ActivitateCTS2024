public class Organigrama {
    private Structura structura;

    private String numeOrganigrama;

    public Organigrama(Structura structura, String numeOrganigrama) {
        this.structura = structura;
        this.numeOrganigrama = numeOrganigrama;
    }

    public String getNumeOrganigrama() {
        return numeOrganigrama;
    }

    public void setNumeOrganigrama(String numeOrganigrama) {
        this.numeOrganigrama = numeOrganigrama;
    }

    public String getDescriere() {
        return structura.getDescriere();
    }
}
