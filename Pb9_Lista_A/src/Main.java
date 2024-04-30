public class Main {
    public static void main(String[] args) {

        Spital spital = new Spital();

         ProxySpitalInternare proxySpitalInternare = new ProxySpitalInternare(spital);

         Pacient pacient1 = new Pacient(false);
         System.out.println(pacient1);

         Pacient pacient2 = new Pacient(true);
         System.out.println(pacient2);




    }
}