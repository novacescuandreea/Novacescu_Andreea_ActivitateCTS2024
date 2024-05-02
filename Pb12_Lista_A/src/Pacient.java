public class Pacient implements IObserver {
    private String nume;

    public Pacient(String nume) {
        this.nume=nume;
    }

    @Override
    public void notificareVirusi(String notificare) {
        System.out.println(nume + " ai primit mesajul: " + notificare);
    }

}
