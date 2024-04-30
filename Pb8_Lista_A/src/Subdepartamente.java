import java.util.ArrayList;

public class Subdepartamente extends ANod {
    private ArrayList<ANod> subNoduri = new ArrayList<>();
    private String denumireSubdepartamente;

    public Subdepartamente(String denumireSubdepartamente) {
        this.denumireSubdepartamente = denumireSubdepartamente;
    }

    @Override
    public String getDenumire() {
        return denumireSubdepartamente;
    }

    @Override
    public void adaugaNod(ANod nod) {
        subNoduri.add(nod);
    }

    @Override
    public void eliminaNod(ANod nod) {
        subNoduri.remove(nod);
    }

    @Override
    public ANod getNod(int index) {
        return subNoduri.get(index);
    }
}
