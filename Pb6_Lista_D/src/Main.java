//Decorator
public class Main {
    public static void main(String[] args) {
        ModalitatePlata modalitatePlata = new ModalitatePlata(){
            public void adaugaModalitatePlata() {
                System.out.println("Se adauga o noua modalitate de plata");
            }
        };

        DecoratorPlata decoratorPlata = new DecoratorPlata(modalitatePlata);
        decoratorPlata.adaugaModalitatePlata();
    }
}
