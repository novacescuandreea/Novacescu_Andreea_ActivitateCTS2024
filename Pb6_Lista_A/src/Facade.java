public class Facade {
    private Pacient pacient;
    private Medic medic;
    private Spital spital;

    public Facade(Pacient pacient, Medic medic, Spital spital) {
        this.pacient = pacient;
        this.medic = medic;
        this.spital = spital;
    }

    public boolean verificaInternare() {
        if (medic.confirmaInternare(pacient)) {
            return spital.verificaDisponibilitatePaturi();
        }
        return false;
    }
}
