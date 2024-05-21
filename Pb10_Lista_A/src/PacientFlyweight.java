import java.util.HashMap;

public class PacientFlyweight implements IFlyweight {
    private final HashMap<String, Pacient> pacienti = new HashMap<>();

    @Override
    public Pacient getPacient(String nume, long numar, String adresa) {
        String key = nume + " " + numar;
        Pacient pacient = pacienti.get(key);

        if (pacient == null) {
            pacient = new Pacient(nume, numar, adresa);
            pacienti.put(key, pacient);
        }

        return pacient;
    }
    }

