public class Cont {
    private double sold;

    public void constituire() {
        System.out.println("Contul a fost constituit.");
    }

    public void retragere(double suma) {
        sold = sold - suma;
        System.out.println("S-a retras suma de " + suma + " lei din cont.");
    }

    public void depunere(double suma) {
        sold = sold + suma;
        System.out.println("S-a depus suma de " + suma + " lei în cont.");
    }

    public void anulareConstituire() {
        System.out.println("Constituirea contului a fost anulată.");
    }
}
