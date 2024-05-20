public class Farmacie {
    Structura structura;
    String numeFarmacie;

    public Farmacie(Structura structura, String numeFarmacie){
        this.structura = structura;
        this.numeFarmacie = numeFarmacie;
    }

    public String getNumeFarmacie() {
        return numeFarmacie;
    }

    public void setNumeFarmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
    }
}
