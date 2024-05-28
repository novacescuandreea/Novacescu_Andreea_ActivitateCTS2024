//flyweight
public class Main {
    public static void main(String[] args) {

        IFlyweight factory = new ClientFlyweight();

        Client client1 = factory.getClient("Andreea N.", 726379228, "Str. Alunului nr. 1");
        Restaurant salon1 = new Restaurant(15, client1);
        salon1.descrieClient();

        Client client2 = factory.getClient("George L.", 732286039, "Str. Fagului nr. 2");
        Restaurant salon2 = new Restaurant(23, client2);
        salon2.descrieClient();
    }
}
