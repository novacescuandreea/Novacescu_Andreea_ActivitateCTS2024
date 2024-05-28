import java.util.ArrayList;

public class Manager {
    private ArrayList<VersiuneMeci> versiuni = new ArrayList();

    public void adaugaVersiune(VersiuneMeci versiuneMeci){
        this.versiuni.add(versiuneMeci);
    }

    public VersiuneMeci recuperareVersiune(int i){
        return versiuni.get(i);
    }
}
