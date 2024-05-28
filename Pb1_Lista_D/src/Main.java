//Builder
public class Main {
    public static void main(String[] args) {
        Banca banca1=Banca.builder().setNumeClient("Novacescu A.").setTipCredit("Ipotecar").build();
        System.out.println(banca1);

        Banca banca2=Banca.builder().setNumeClient("Lungu G.").setTipCredit("Nevoi Personale").build();
        System.out.println(banca2);

    }
}
