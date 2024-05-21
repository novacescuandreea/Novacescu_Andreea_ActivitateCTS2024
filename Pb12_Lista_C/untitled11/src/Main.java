public class Main {
    public static void main(String[] args) {


        Farmacie farmacie = new Farmacie("Catena");

        Client client1 = new Client("Novacescu");
        farmacie.aboneazaClient(client1);


        Client client2 = new Client("Lungu");
        farmacie.aboneazaClient(client2);

        farmacie.trimiteNotificare("Oferte pentru antiinflamatoare");
        farmacie.trimiteNotificare("Oferte pentru suplimente");

    }
}
