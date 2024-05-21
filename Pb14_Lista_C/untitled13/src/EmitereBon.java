public class EmitereBon {
    private Reteta reteta;
    private Stoc stoc;

    public EmitereBon(Reteta reteta, Stoc stoc) {
        this.reteta = reteta;
        this.stoc = stoc;
    }

    public void emiteBon() {
        if (stoc.esteDisponibil(reteta.getNumar())) {
            stoc.scadeCantitate(reteta.getNumar());
            System.out.println("Bon emis pentru " + reteta.getNumeMedicament() + " in cantitate de " + reteta.getNumar());
        } else {
            System.out.println("Stoc insuficient pentru " + reteta.getNumeMedicament());
        }
    }

}
