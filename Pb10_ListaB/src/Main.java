//flyweight
public class Main {
    public static void main(String[] args) {

        Persoana persoana = new Persoana("Andreea N", "76379285", "anovacescu15@gmail.com");
        PersoanaFlyweight flyweight = new PersoanaFlyweight(persoana);
        Rezervare rezervare = new Rezervare(1, 4, "21:00", flyweight);
        rezervare.printeazaInformatiiRezervare();
    }
}
