public abstract class Verificare {
    private Verificare verificare;

    public Verificare getVerificare() {
        return verificare;
    }

    public void setVerificare(Verificare verificare) {
        this.verificare = verificare;
    }

    abstract void procesareModulComenzi(ModulComenzi modulComenzi);
}
