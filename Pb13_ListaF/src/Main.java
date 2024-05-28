public class Main {
public static void main(String[] args){
    Manager manager = new Manager();
    Autobuz autobuz1 = new Autobuz("A",20,1999);
    Autobuz autobuz2 = new Autobuz("B",30,2009);

    autobuz1.adaugaCondtii("C1");
    System.out.println(autobuz1);

    autobuz1.adaugaCondtii("C2");
    System.out.println(autobuz1);

    manager.adaugaVersiune(autobuz1.salvare());

    autobuz1.adaugaCondtii("C3");
    System.out.println(autobuz1);
    manager.adaugaVersiune(autobuz1.salvare());

    autobuz1.refacereVersiune(manager.recuperareVersiune(0));

    System.out.println(autobuz1);
}



}
