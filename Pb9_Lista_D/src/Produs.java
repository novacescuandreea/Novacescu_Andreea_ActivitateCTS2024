public class Produs extends ANod{
    private String denumire;

    public Produs(String denumire) {
        this.denumire = denumire;

    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }
}
