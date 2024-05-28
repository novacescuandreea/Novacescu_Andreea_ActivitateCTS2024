//strategy
public class Main {
    public static void main(String[] args) {

        Strategy card = new Card();
        Client clientCard = new Client("Andreea N.", card);
        System.out.println("Numele pacientului: " + clientCard.getNume());
        System.out.println("Modalitate plata: " + clientCard.getPlata().getClass().getSimpleName());

        Strategy cash = new Cash();
        Client clientCash = new Client("George L.", cash);
        System.out.println("Numele pacientului: " + clientCash.getNume());
        System.out.println("Modalitate plata: " + clientCash.getPlata().getClass().getSimpleName());
    }
}