public class Cash implements Plata{

    @Override
    public void plateste(String numeClient, String tipPlata) {
        System.out.println("Pacientul " + numeClient + " plateste cu " + tipPlata);
    }
}
