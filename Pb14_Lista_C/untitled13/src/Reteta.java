public class Reteta {
    private String numeMedicament;
    private int numar;


    public Reteta(String numeMedicament, int numar) {
        this.numeMedicament = numeMedicament;
        this.numar = numar;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }
}
