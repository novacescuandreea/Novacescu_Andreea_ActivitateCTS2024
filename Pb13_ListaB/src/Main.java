//state
public class Main {
    public static void main(String[] args) {
        Masa masa= new Masa("Masa 1");
        masa.executaStare();

        masa.setStare(new Ocupata());
        masa.executaStare();

        masa.setStare(new Rezervata());
        masa.executaStare();
    }
}
