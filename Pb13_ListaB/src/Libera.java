public class Libera implements State {
    @Override
    public void doAction(Masa masa) {
        System.out.println("Masa " + masa.getNume() + "are starea libera.");

    }
}
