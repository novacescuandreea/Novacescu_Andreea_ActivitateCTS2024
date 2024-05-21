public class Card implements Strategy {

    @Override
    public void plateste(String numePacient, String tipPlata) {
        System.out.println("Pacientul " + numePacient + " plateste cu " + tipPlata);
    }
}
