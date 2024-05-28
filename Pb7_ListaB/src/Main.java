//Decorator
public class Main {
    public static void main(String[] args) {
        NotaDePlata notaDePlata = new NotaDePlata();

       DecoratorFelicitare notaDecorata = new DecoratorFelicitare(notaDePlata);

        notaDecorata.printeazaNota();
    }
}
