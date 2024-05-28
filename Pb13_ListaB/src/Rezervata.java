public class Rezervata implements State {
    @Override
    public void doAction(Masa masa) {
        System.out.println("Masa " + masa.getNume() + "are starea rezervata.");

    }
}