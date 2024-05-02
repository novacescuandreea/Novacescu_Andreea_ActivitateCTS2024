public class Pacient {
    private String nume;
    private Plata plata;

    public Pacient(String nume, Plata plata) {
        this.nume = nume;
        this.plata = plata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Plata getPlata() {
        return plata;
    }

    public void setPlata(Plata plata) {
        this.plata = plata;
    }
}
