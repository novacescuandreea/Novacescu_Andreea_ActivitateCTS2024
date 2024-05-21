public class Main {
    public static void main(String[] args) {

        Stoc stoc = new Stoc("Augmentin", 45);
        Farmacie farmacie = new Farmacie(stoc);

        Reteta reteta1 = new Reteta("Augmentin", 35);
        farmacie.proceseazaReteta(reteta1);

        Reteta reteta2 = new Reteta("Augmentin", 25);
        farmacie.proceseazaReteta(reteta2);

        Reteta reteta3 = new Reteta("Augmentin", 4);
        farmacie.proceseazaReteta(reteta3);

        Reteta reteta4 = new Reteta("Augmentin", 2);
        farmacie.proceseazaReteta(reteta4);

    }
}
