public class ComenziTratareImediata implements ICommand {
    private Pacient pacient;

    public ComenziTratareImediata(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        System.out.println("Tratare rapida pentru pacientul " + pacient.getNume());
    }
}
