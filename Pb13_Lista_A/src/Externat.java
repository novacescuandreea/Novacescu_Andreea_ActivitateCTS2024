public class Externat implements State {
    @Override
    public void doAction(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + "are starea externat.");

    }
}
