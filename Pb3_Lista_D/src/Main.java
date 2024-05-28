//Builder
public class Main {
    public static void main(String[] args) {
        Cont cont1=Cont.builder().setNumeClient("Novacescu A.").setAreCard(true).setAreInternetBanking(true).setPrimeseSalariulOnline(true).build();
        System.out.println(cont1);

        Cont cont2=Cont.builder().setNumeClient("Lungu G.").setAreCard(true).setAreInternetBanking(false).setPrimeseSalariulOnline(false).build();
        System.out.println(cont2);

    }
}
