public class Farmacie {
    private Stoc stoc;

    public Farmacie(Stoc stoc) {
        this.stoc = stoc;
    }

    public void proceseazaReteta(Reteta reteta) {
        EmitereBon emitereBon = new EmitereBon(reteta, stoc);
        emitereBon.emiteBon();
    }

}
