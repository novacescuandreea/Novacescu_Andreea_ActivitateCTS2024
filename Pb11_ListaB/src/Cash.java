public class Cash implements Strategy {

    @Override
    public void plateste(String numeClient, String tipPlata) {
        System.out.println("Clientul " + numeClient + " plateste cu " + tipPlata);
    }
}
