public class SubObservatie implements State {
    @Override
    public void doAction(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + "are starea sub observatie.");
    }
}
