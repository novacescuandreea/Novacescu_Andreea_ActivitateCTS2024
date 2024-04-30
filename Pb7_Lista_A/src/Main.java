public class Main {
    public static void main(String[] args) {
        Rezultate rezultateBaza = new Rezultate();
        rezultateBaza.adaugaRezultat("Rezultat 1");
        rezultateBaza.adaugaRezultat("Rezultat 2");

        System.out.println("Rezultate de bază:");
        rezultateBaza.afiseazaRezultate();
        System.out.println();

        RezultateDecoratorOnline rezultateOnline = new RezultateDecoratorOnline(rezultateBaza, "Rezultate online");
        System.out.println("Rezultatele online sunt:");
        rezultateOnline.afiseazaRezultate();
        System.out.println();

        RezultateDecoratorPrintate rezultatePrintate = new RezultateDecoratorPrintate(rezultateBaza, "Rezultate printate");
        System.out.println("Rezultatele printate sunt:");
        rezultatePrintate.afiseazaRezultate();
        System.out.println();
    }
}
