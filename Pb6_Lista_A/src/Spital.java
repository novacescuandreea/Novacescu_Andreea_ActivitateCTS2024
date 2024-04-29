public class Spital {

    private Salon salon;

    public Spital(Salon salon) {
        this.salon = salon;
    }

    public boolean verificaDisponibilitatePaturi() {
        return salon.getPaturiLibere() > 0;
    }

}
