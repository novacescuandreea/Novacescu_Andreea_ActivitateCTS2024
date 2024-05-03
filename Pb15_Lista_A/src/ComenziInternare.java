public class ComenziInternare implements ICommand{

    private Pacient pacient;

    public ComenziInternare(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        System.out.println("Internarea pacientului " + pacient.getNume());
    }
}
