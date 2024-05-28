//Facade
public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(true,true,true);
        Facade facade = new Facade(masa);

        boolean masaLibera = facade.verificaMasaLibera();
        boolean masaDebarasata = facade.verificaMasaDebarasata();
        boolean servetelePuse = facade.verificaServetelePuse();

        System.out.println(masaLibera);
        System.out.println(masaDebarasata);
        System.out.println(servetelePuse);
    }
}
