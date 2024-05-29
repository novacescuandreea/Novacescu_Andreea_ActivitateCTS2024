public class Clienti implements  IObserver{

    private String nume;

    public Clienti(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificareOferte(String notificare) {
        System.out.println(nume + " ai primit mesajul: " + notificare);
    }
}
