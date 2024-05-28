//Builder Pattern
public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = Rezervare.builder().setAreAsezareLaGeam(false).setAreMasaDecorata(false).setAreScauneErgonomice(false).setAreMuzicaAmbientalaPersonalizat(false).setNrPersoane(2).build();
        System.out.println(rezervare1);

        Rezervare rezervare2 = Rezervare.builder().setAreAsezareLaGeam(true).setAreMasaDecorata(true).setAreScauneErgonomice(false).setAreMuzicaAmbientalaPersonalizat(false).setNrPersoane(2).build();
        System.out.println(rezervare1);
    }
}
