public class Main {

    public static void main(String[] args) {
            AltaReteta retetaTip1 = PrototypeFactory.getPrototipReteta("reteta1");
            if (retetaTip1 != null) {
                retetaTip1.setId("1");
                retetaTip1.printare();
                retetaTip1.modificareListaReteta(1, "Nou");
            } else {
                System.out.println("Nu s-a putut obtine prototipul retetei 1.");
            }

            AltaReteta retetaTip2 = PrototypeFactory.getPrototipReteta("reteta2");
            if (retetaTip2 != null) {
                retetaTip2.setId("2");
                retetaTip2.printare();
                retetaTip2.modificareListaReteta(2, "Nou");
            } else {
                System.out.println("Nu s-a putut obtine prototipul retetei 2");
            }

            System.out.println("Testare shallow-copy cu Prototype");
            if (retetaTip1 != null && retetaTip2 != null && retetaTip1.getListaReteta() == retetaTip2.getListaReteta())
                System.out.println("Aceeasi reteta");
            else
                System.out.println("Retete diferite");
        }
}
