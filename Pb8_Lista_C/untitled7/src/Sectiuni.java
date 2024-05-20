import java.util.ArrayList;

public class Sectiuni extends ANod{
    private ArrayList<ANod> subNoduri = new ArrayList<>();
    private String denumireSectiuni;

    public Sectiuni(String denumireDepartamente) {
        this.denumireSectiuni = denumireSectiuni ;
    }

    @Override
    public String getDenumire() {
        return denumireSectiuni ;
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
