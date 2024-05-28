public class Meci {
    private long dataMeci;
    private String echipaA;
    private String echipaB;
    private int nrBilete;
    private int nrSpectatori;
    private int nrSticle;
    private int nrJandarmi;
    private int nrStewarzi;
    private String variante;

    public Meci(long dataMeci, String echipaA, String echipaB, int nrBilete, int nrSpectatori, int nrSticle, int nrJandarmi, int nrStewarzi) {
        this.dataMeci = dataMeci;
        this.echipaA = echipaA;
        this.echipaB = echipaB;
        this.nrBilete = nrBilete;
        this.nrSpectatori = nrSpectatori;
        this.nrSticle = nrSticle;
        this.nrJandarmi = nrJandarmi;
        this.nrStewarzi = nrStewarzi;
        this.variante = " ";
    }

    @Override
    public String toString() {
        return "Meci{" +
                "dataMeci=" + dataMeci +
                ", echipaA='" + echipaA + '\'' +
                ", echipaB='" + echipaB + '\'' +
                ", nrBilete=" + nrBilete +
                ", nrSpectatori=" + nrSpectatori +
                ", nrSticle=" + nrSticle +
                ", nrJandarmi=" + nrJandarmi +
                ", nrStewarzi=" + nrStewarzi +
                ", variante='" + variante + '\'' +
                '}';
    }

    public void adaugaVariante(String variante){
        this.variante = this.variante + variante;
    }

    public void refacereVarianteMeci(VersiuneMeci versiuneMeci){
        this.variante = versiuneMeci.getVariante();
    }

    public VersiuneMeci salvare(){
        System.out.println("->Salvare");
        return new VersiuneMeci(variante);
    }
}
