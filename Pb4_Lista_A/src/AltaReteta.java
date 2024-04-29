import java.util.ArrayList;

public abstract class AltaReteta implements Cloneable{
    private String id;
    protected String reteta;
    protected ArrayList<String> listaRetete;

    public void modificareListaReteta(int i, String retetaNoua) {
        listaRetete.set(i, retetaNoua);
    }

    abstract void printare();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReteta() {
        return reteta;
    }

    public ArrayList<String> getListaReteta() {
        return listaRetete;
    }

    @Override
    public String toString() {
        return "AltaReteta [id=" + id + ", reteta=" + reteta + ", listaRetete=" + listaRetete + "]";
    }

    @Override
    public AltaReteta clone() {
        try {
            AltaReteta clone = (AltaReteta) super.clone();
            clone.listaRetete = new ArrayList<>(this.listaRetete); // copie profundă
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
