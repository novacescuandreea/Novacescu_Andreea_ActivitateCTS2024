public class Main {
    public static void main(String[] args) {
        Ghiseu ghiseu = new Ghiseu("Ghiseu A", new PersoanaFizica());

        ghiseu.efectueazaVerificareActe("Andreea N.");

        ghiseu.setiStrategy(new PersoanaJuridica());

         ghiseu.efectueazaVerificareActe("Liberty Galati");
    }
}
