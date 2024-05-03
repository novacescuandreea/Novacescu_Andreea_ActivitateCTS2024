public class FisaInternare {
    private StarePacient starePacient;
    private Salon salon;

    public FisaInternare(StarePacient starePacient, Salon salon) {
        this.starePacient = starePacient;
        this.salon = salon;
    }

    public StarePacient getStarePacient() {
        return starePacient;
    }

    public void setStarePacient(StarePacient starePacient) {
        this.starePacient = starePacient;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }
}
