//Adapter
public class Main {
    public static void main(String[] args) {
        SoftBar softBar = new SoftBar();
        AdapterSoft adapterSoft = new AdapterSoft(softBar);
        adapterSoft.printeazaFactura("Cocktail", 25.0);
    }
}
