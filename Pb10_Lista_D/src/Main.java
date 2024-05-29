public class Main {
    public static void main(String[] args) {
        ContFlyweight flyweight = new ContFlyweight();

        Cont cont1 = flyweight.getCont("Novacescu Andreea", 123456789, "Str. Principala, Nr. 1");
        Cont cont2 = flyweight.getCont("Novacescu Andreea", 123456789, "Str. Principala, Nr. 1");

        System.out.println(cont1 == cont2);

        Banca banca = new Banca("Banca XYZ", "Sucursala Centrală", 1000000);
        System.out.println("Numele băncii: " + banca.getNume());
        System.out.println("Sucursala: " + banca.getSucursala());
        System.out.println("Capitalul: " + banca.getCapital());
    }
}
