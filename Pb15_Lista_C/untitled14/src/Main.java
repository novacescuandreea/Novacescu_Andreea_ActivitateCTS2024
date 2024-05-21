public class Main {
    public static void main(String[] args) {
        AjutorFarmacist ajutorFarmacist = new AjutorFarmacist();

        Reteta reteta1 = new Reteta(5);
        ICommand comanda1 = new RetetePreluate(reteta1);
        ajutorFarmacist.primesteComanda(reteta1, comanda1);

        Reteta reteta2 = new Reteta(10);
        ICommand comanda2 = new RetetePreluateViitor(reteta2);
        ajutorFarmacist.primesteComanda(reteta2, comanda2);
    }
}
