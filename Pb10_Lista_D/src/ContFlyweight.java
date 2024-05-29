import java.util.HashMap;

public class ContFlyweight implements IFlyweight {
    private final HashMap<String, Cont> conturi = new HashMap<>();

    @Override
    public Cont getCont(String nume, long numar, String adresa) {
        String key = nume + " " + numar;
        Cont cont = conturi.get(key);

        if (cont == null) {
            cont = new Cont(nume, numar, adresa);
            conturi.put(key, cont);
        }

        return cont;
    }
}
