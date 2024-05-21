public class Main {
    public static void main(String[] args) {
        IFlyweight flyweight = new ClientFlyweight();

        Client client1 = flyweight.getClient("Andreea N.", 725326452, "Str. Alunului nr. 1", 5);
        Reteta reteta1 = new Reteta(client1, 15, 25, 5);
        reteta1.descrieClient();

        Client client2 = flyweight.getClient("George L.", 776644552, "Str. Fagului nr. 15", 6);
        Reteta reteta2 = new Reteta(client2, 16, 35, 10);
        reteta2.descrieClient();

    }
}
