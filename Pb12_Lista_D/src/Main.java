public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca("BCR");

        Clienti client1 = new Clienti("Novacescu");
        banca.aboneazaClient(client1);


        Clienti client2 = new Clienti("Lungu");
        banca.aboneazaClient(client2);

        banca.trimiteNotificare("Oferte pentru antiinflamatoare");
        banca.trimiteNotificare("Oferte pentru suplimente");

    }
}
