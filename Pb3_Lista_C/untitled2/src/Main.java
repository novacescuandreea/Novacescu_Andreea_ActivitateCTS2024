public class Main {
    public static void main(String[] args) {
        Reteta reteta1 = Reteta.builder().setAreCardDeFidelitate(true).setArePlataCuCardul(false).setCotaTva(true).setNumarPungi(2).setPlatitorDeTVA(false).setAreCash(true).build();
        System.out.println(reteta1);

        Reteta reteta2 = Reteta.builder().setAreCardDeFidelitate(false).setArePlataCuCardul(false).setCotaTva(true).setNumarPungi(2).setPlatitorDeTVA(false).setAreCash(true).build();
        System.out.println(reteta2);
    }
}
