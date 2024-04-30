public class Spital {
    Structura structura;
    String numeSpital;

    public Spital(Structura structura, String numeSpital){
        this.structura = structura;
        this.numeSpital = numeSpital;
    }

    public String getNumeSpital() {
        return numeSpital;
    }

    public void setNumeSpital(String numeSpitalt) {
        this.numeSpital = numeSpitalt;
    }
}
