public class RezultateDecoratorPrintate extends DecoratorRezultate {
    private String rezultatePrintate;

    public RezultateDecoratorPrintate(Rezultate rezultate, String rezultatePrintate) {
        super(rezultate);
        this.rezultatePrintate = rezultatePrintate;
    }

    public String getRezultatePrintate() {
        return rezultatePrintate;
    }

    public void setRezultatePrintate(String rezultatePrintate) {
        this.rezultatePrintate = rezultatePrintate;
    }

    @Override
    public void afiseazaRezultate() {
        super.afiseazaRezultate(); // Afișează rezultatele de bază
        System.out.println("Rezultate printate: " + rezultatePrintate);
    }
}