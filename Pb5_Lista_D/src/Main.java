//Adapter
public class Main {
    public static void main(String[] args) {

        Framework framework= new Framework();
        AdapterFramework adapterFramework = new AdapterFramework(framework);
        adapterFramework.achizitioneazaFramework();
    }
}
