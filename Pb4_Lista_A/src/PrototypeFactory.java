import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static Map<String, AltaReteta> prototipuriRetete = new HashMap<>();

    static {
        System.out.println("Initializare retete prin citirea din BD");
        ReteteTip reteteTip = new ReteteTip();
        prototipuriRetete.put("reteta", reteteTip);
    }

    public static AltaReteta getPrototipReteta(String tip) {
        AltaReteta prototipReteta = prototipuriRetete.get(tip);
        if (prototipReteta != null)
            return prototipReteta.clone();
        return null;
    }
}
