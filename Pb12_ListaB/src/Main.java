//Observer
public class Main {
    public static void main(String[] args) {


        Restaurant restaurant=new Restaurant("X");
        Client client1 = new Client("Novacescu");
        restaurant.aboneazaClient(client1);

        Client client2 = new Client("Lungu");
        restaurant.aboneazaClient(client2);

        restaurant.trimiteNotificare("Oferta 1");
        restaurant.trimiteNotificare("Oferta 2");
    }
}
