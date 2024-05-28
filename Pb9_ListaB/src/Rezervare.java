public class Rezervare implements IRezervare {
    @Override
    public boolean realizeazaRezervare(int numarPersoane) {
        return numarPersoane >= 4;
    }
}