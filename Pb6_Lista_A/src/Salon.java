public class Salon {
    private int paturiLibere;

    public Salon(int paturiLibere) {
        this.paturiLibere = paturiLibere;
    }

    public int getPaturiLibere() {
        return paturiLibere;
    }

    public void ocupaPat() {
        paturiLibere--;
    }

    public void elibereazaPat() {
        paturiLibere++;
    }

}
