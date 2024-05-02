public class Salon {
    private int nrSalon;
    private int nrPat;
    private int nrZileSpitalizare;
    private Pacient pacient;

    public Salon(int nrSalon, int nrPat, int nrZileSpitalizare, Pacient pacient) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
        this.pacient = pacient;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public void setNrSalon(int nrSalon) {
        this.nrSalon = nrSalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public void setNrPat(int nrPat) {
        this.nrPat = nrPat;
    }

    public int getNrZileSpitalizare() {
        return nrZileSpitalizare;
    }

    public void setNrZileSpitalizare(int nrZileSpitalizare) {
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public void descriePacient() {
        System.out.println("Salon: " + nrSalon);
        System.out.println("Pat: " + nrPat);
        System.out.println("Zile spitalizare: " + nrZileSpitalizare);
        System.out.println("Pacient: " + pacient.getNume());
        System.out.println("Numar telefon: " + pacient.getNumar());
        System.out.println("Adresa: " + pacient.getAdresa());
        System.out.println();
    }
}
