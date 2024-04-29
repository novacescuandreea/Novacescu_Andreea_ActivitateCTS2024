public class Main {
    public static void main(String[] args){
        Spital spital = Spital.builder().setArePatRabatabil(false).setAreMicDejunInclus(true).setArePapuciDeCamera(false).setAreHalatPentruInterior(true).build();
        System.out.println(spital);

        Spital spital1 = new Spital.SpitalBuilder().setAreHalatPentruInterior(false).build();
        System.out.println(spital1);
    }
}