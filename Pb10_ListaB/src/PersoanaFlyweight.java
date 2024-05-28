public class PersoanaFlyweight  implements IFlyweight {
    private Persoana persoana;

    public PersoanaFlyweight(Persoana persoana) {
        this.persoana = persoana;
    }

    @Override
    public void printeazaInformatii() {
        System.out.println(persoana.getNume());
        System.out.println(persoana.getNumarTelefon());
        System.out.println(persoana.getAdresaEmail());
    }
}