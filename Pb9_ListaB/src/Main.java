//proxy
public class Main {
    public static void main(String[] args) {
        IRezervare proxyRezervare = new ProxyRezervare();

        boolean rezervare1 = proxyRezervare.realizeazaRezervare(2);
        boolean rezervare2 = proxyRezervare.realizeazaRezervare(4);

        System.out.println("Rezervare pentru 2 persoane: " + rezervare1);
        System.out.println("Rezervare pentru 4 persoane: " + rezervare2);
    }
}
