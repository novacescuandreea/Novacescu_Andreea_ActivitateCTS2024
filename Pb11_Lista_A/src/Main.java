public class Main {
    public static void main(String[] args) {

        Plata card = new Card();
        Pacient pacientCard = new Pacient("Andreea N.", card);
        System.out.println("Numele pacientului: " + pacientCard.getNume());
        System.out.println("Modalitate plata: " + pacientCard.getPlata().getClass().getSimpleName());

        Plata cash = new Cash();
        Pacient pacientCash = new Pacient("George L.", cash);
        System.out.println("Numele pacientului: " + pacientCash.getNume());
        System.out.println("Modalitate plata: " + pacientCash.getPlata().getClass().getSimpleName());
    }
}