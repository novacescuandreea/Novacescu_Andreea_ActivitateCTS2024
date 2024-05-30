import java.util.ArrayList;

public class Structura extends ANod {

    private ArrayList<ANod> structura = new ArrayList<>();
    private String numeStructura;

    private int nr;

    public Structura(String numeStructura) {
        this.numeStructura = numeStructura;
    }


    @Override
    public String getDenumire() {
        return this.numeStructura;
    }

    @Override
    public String getDescriere() {
        StringBuilder descriere = new StringBuilder(this.numeStructura + "\n");
        for (ANod n : structura) {
            descriere.append(" ").append(n.getDescriere()).append("\n");
        }
        return descriere.toString();
    }

    @Override
    public void adauga(ANod copil) {
        structura.add(copil);
    }

    @Override
    public void sterge(ANod copil) {
        structura.remove(copil);
    }

    @Override
    public ANod getCopil(int index) {
        return structura.get(index);
    }
}