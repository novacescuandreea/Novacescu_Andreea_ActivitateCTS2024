public class Autobuz {
    private String numeSofer;
    private float consumMediu;
    private String model;
    private int nrLocuri;
    private int anFab;
    private String conditii;

    public Autobuz(String model, int nrLocuri, int anFab) {
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.anFab = anFab;
        this.numeSofer = " ";
        this.consumMediu = 0;
        this.conditii = " ";
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", consumMediu=" + consumMediu +
                ", model='" + model + '\'' +
                ", nrLocuri=" + nrLocuri +
                ", anFab=" + anFab +
                ", conditii='" + conditii + '\'' +
                '}';
    }

    public void adaugaCondtii(String conditii){
        this.conditii = this.conditii + "," + conditii;
    }
    public void refacereVersiune(VersiuneAutobuz versiuneAutobuz){
      this.conditii = versiuneAutobuz.getConditii();
    }

    public VersiuneAutobuz salvare(){
        System.out.println("->Salvare");
        return new VersiuneAutobuz(conditii);
    }
}
