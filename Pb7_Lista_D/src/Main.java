//Facade
public class Main {
    public static void main(String[] args) {
        ContClient contClient = new ContClient(25); // Presupunem că clientul are 25 de ani
        Operator operator = new Operator();

        Facade facade = new Facade(contClient, operator);

        boolean contCreat = facade.verificaVarsta();

        if (contCreat) {
            System.out.println("Cont creat cu succes!");
        } else {
            System.out.println("Crearea esuata.");
        }
    }
}
