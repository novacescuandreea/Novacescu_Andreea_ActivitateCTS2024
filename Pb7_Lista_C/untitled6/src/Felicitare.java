public class Felicitare extends Decorator {

    public Felicitare(BonDeCasa bonDeCasa) {
        super(bonDeCasa);
    }

    @Override
    public void printareBon() {
        super.printareBon();
        printareFelicitare();
    }

    private void printareFelicitare() {
        System.out.println("O felicitare cu mesajul: La Multi Ani!");
    }
}
