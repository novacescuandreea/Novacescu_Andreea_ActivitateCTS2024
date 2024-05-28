//Observer
public class Main {
    public static void main(String[] args) {
        Oferte Oferte = new Oferte();

        Oferte.adaugaObservator(new Email("anovacescu@gmail.com"));
        Oferte.adaugaObservator(new SMS("123456789"));
        Oferte.adaugaObservator(new Restaurant());

        String message = "O noua oferta";
        Notificare notificatore = new Notificare();
        notificatore.trimiteNotificare(Oferte.getObservers(), message);
    }
}
