//Prototype
public class Main {
    public static void main(String[] args) {

        initialize();

        try {
            Client clientExistent = (Client) PrototypeFactory.getPrototype("client");
            Cont contExistent = (Cont) PrototypeFactory.getPrototype("cont");

            System.out.println("Detalii client existent:");
            System.out.println(clientExistent);
            System.out.println("Detalii cont existent:");
            System.out.println(contExistent);

            Client clientNou = (Client) clientExistent.clone();
            Cont contNou = (Cont) contExistent.clone();

            System.out.println("\nDetalii client nou:");
            System.out.println(clientNou);
            System.out.println("Detalii cont nou:");
            System.out.println(contNou);

            contNou.setSold(2000.0);
            System.out.println("\nDetalii cont nou dupa actualizare:");
            System.out.println(contNou);
        } catch (CloneNotSupportedException e) {
            System.out.println("Eroare la clonare: " + e.getMessage());
        }
    }

    public static void initialize() {
        PrototypeFactory.addPrototype("client", new AltCont("Andreea N.", "Str. Principala nr. 10"));
        PrototypeFactory.addPrototype("cont", new Cont("Andreea N.", "Str. Principala nr. 10", 5000.0));
    }
}
