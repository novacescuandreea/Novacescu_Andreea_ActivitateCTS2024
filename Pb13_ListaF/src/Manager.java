import java.util.ArrayList;

public class Manager {
    private ArrayList<VersiuneAutobuz> versiuni = new ArrayList();

    public void adaugaVersiune(VersiuneAutobuz versiuneAutobuz){
        this.versiuni.add(versiuneAutobuz);
    }

    public VersiuneAutobuz recuperareVersiune(int i){
        return versiuni.get(0);
    }
}
