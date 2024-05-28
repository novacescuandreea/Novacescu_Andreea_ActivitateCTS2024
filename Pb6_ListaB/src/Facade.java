public class Facade {
    private Masa masa;

    public Facade(Masa masa) {
        this.masa = masa;
    }

    public boolean verificaMasaLibera() {
        return masa.isEsteLiber();
    }

    public boolean verificaMasaDebarasata() {
        return masa.isEsteDebarasata();
    }

    public boolean verificaServetelePuse() {
        return masa.isAuFostPuseServetele();
    }

}
