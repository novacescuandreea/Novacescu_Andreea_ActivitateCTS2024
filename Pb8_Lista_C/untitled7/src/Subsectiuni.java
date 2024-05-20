import java.util.ArrayList;

public class Subsectiuni extends ANod {
    private ArrayList<ANod> subNoduri = new ArrayList<>();
    private String denumireSubsectiuni;

    public Subsectiuni(String denumireSubsectiuni) {
        this.denumireSubsectiuni = denumireSubsectiuni;
    }

    @Override
    public String getDenumire() {
        return denumireSubsectiuni;
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
