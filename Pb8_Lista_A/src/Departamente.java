import java.util.ArrayList;

public class Departamente extends ANod{
    private ArrayList<ANod> subNoduri = new ArrayList<>();
    private String denumireDepartamente;

    public Departamente(String denumireDepartamente) {
        this.denumireDepartamente = denumireDepartamente;
    }

    @Override
    public String getDenumire() {
        return denumireDepartamente;
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
