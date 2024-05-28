public class Ocupare extends AOcupare{
    @Override
    void curatareMasa() {
        System.out.println("Se curata mesele");
    }

    @Override
    void asezareServetele() {
        System.out.println("Se aseaza servetele");
    }

    @Override
    void asezareTacamuri() {
        System.out.println("Se aseaza tacamurile");
    }

    @Override
    void invitatePersoaneMasa() {
        System.out.println("Pers sunt invitate la masa");
    }
}
