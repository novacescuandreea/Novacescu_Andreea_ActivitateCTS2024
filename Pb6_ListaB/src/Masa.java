public class Masa {
    private boolean esteLiber = true;
    private boolean esteDebarasata = true;
    private boolean auFostPuseServetele = true;

    public Masa(boolean esteLiber, boolean esteDebarasata, boolean auFostPuseServetele) {
        this.esteLiber = esteLiber;
        this.esteDebarasata = esteDebarasata;
        this.auFostPuseServetele = auFostPuseServetele;
    }

    public boolean isEsteLiber() {
        return esteLiber;
    }

    public void setEsteLiber(boolean esteLiber) {
        this.esteLiber = esteLiber;
    }

    public boolean isEsteDebarasata() {
        return esteDebarasata;
    }

    public void setEsteDebarasata(boolean esteDebarasata) {
        this.esteDebarasata = esteDebarasata;
    }

    public boolean isAuFostPuseServetele() {
        return auFostPuseServetele;
    }

    public void setAuFostPuseServetele(boolean auFostPuseServetele) {
        this.auFostPuseServetele = auFostPuseServetele;
    }
}
