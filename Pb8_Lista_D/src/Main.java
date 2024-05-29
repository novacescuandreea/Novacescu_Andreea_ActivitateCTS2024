public class Main {
    public static void main(String[] args) {
        CreareCont creareCont = new DecoratorCredit(new CreareCont());
        creareCont.adaugaCreareCont();
    }
}
