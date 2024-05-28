import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static Map<String, Client> prototypes = new HashMap<>();

    public static void initialize() {
        prototypes.put("client", new AltCont("Default Name", "Default Address"));
        prototypes.put("cont", new Cont("Default Name", "Default Address", 0.0));
    }

    public static void addPrototype(String key, Client prototype) {
        prototypes.put(key, prototype);
    }

    public static Client getPrototype(String key) {
        try {
            return (Client) prototypes.get(key).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}