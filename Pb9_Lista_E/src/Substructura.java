public class Substructura extends ANod{
    private String denumire;

    public Substructura(String denumire) {
        this.denumire = denumire;

    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }
}
