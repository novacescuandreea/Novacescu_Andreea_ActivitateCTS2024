public class RezultateDecoratorOnline extends DecoratorRezultate {
    private String rezultateOnline;

    public RezultateDecoratorOnline(Rezultate rezultate, String rezultateOnline) {
        super(rezultate);
        this.rezultateOnline = rezultateOnline;
    }

    public String getRezultateOnline() {
        return rezultateOnline;
    }

    public void setRezultateOnline(String rezultateOnline) {
        this.rezultateOnline = rezultateOnline;
    }

    @Override
    public void afiseazaRezultate() {
        super.afiseazaRezultate(); // Afișează rezultatele de bază
        System.out.println("Rezultate online: " + rezultateOnline);
    }
}