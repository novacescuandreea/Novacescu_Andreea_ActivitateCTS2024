import java.util.ArrayList;
import java.util.List;

public class Rezultate {
    private boolean existaRezultate;
    private List<String> rezultate;

    public Rezultate() {
        this.rezultate = new ArrayList<>();
    }
    int getID(){
        return 10;
    }

    public void afiseazaRezultate() {
        for (String rezultat : rezultate) {
            System.out.println(rezultat);
        }
    }

    public void adaugaRezultat(String rezultat) {
        rezultate.add(rezultat);
    }
}
