import java.util.ArrayList;

public class ReteteTip extends AltaReteta{
    public ReteteTip() {
        System.out.println("Incarcare reteta din BD");

        listaRetete = new ArrayList<>();
        listaRetete.add("reteta A");
        listaRetete.add("reteta B");
        this.reteta = "reteta";
    }

    @Override
    void printare() {
        System.out.println("Reteta: " + this.reteta);
        System.out.println("Lista retete:");
        for (String reteta : this.listaRetete) {
            System.out.println("- " + reteta);
        }
    }

    @Override
    public ReteteTip clone() {
        ReteteTip clone = (ReteteTip) super.clone();
        clone.listaRetete = new ArrayList<>(this.listaRetete);
        return clone;
    }
}
