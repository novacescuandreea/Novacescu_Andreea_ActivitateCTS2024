public class Main {
    public static void main(String[] args) {
        BonDeCasa bonDeCasa = new BonDeCasa();
        BonDeCasa bonCuFelicitare = new Felicitare(bonDeCasa);

        System.out.println("Bon de casă fara felicitare:");
        bonDeCasa.printareBon();

        System.out.println("\nBon de casă cu felicitare:");
        bonCuFelicitare.printareBon();
    }
}
