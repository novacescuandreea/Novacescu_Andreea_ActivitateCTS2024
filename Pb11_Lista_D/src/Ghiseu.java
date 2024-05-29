public class Ghiseu {
    private String nume;
    private IStrategy iStrategy;

    public Ghiseu(String nume, IStrategy iStrategy) {
        this.nume = nume;
        this.iStrategy = iStrategy;
    }

    public void efectueazaVerificareActe(String numeClient) {
        iStrategy.verificareActe(numeClient);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IStrategy getiStrategy() {
        return iStrategy;
    }

    public void setiStrategy(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }
}
