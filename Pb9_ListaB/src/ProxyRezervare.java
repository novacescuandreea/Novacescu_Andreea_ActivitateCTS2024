public class ProxyRezervare implements IRezervare {
    private Rezervare rezervare;

    public ProxyRezervare() {
        this.rezervare = new Rezervare();
    }

    @Override
    public boolean realizeazaRezervare(int numarPersoane) {
        if (numarPersoane >= 4) {
            return rezervare.realizeazaRezervare(numarPersoane);
        } else {
            System.out.println("Ne pare rau.");
            return false;
        }
    }
}