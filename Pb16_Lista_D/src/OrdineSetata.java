import java.util.ArrayList;
import java.util.List;

public class OrdineSetata implements IStrategy {
        private List<String> ordineConturi;

    public OrdineSetata(List<String> ordineConturi) {
            this.ordineConturi = ordineConturi;
        }

        @Override
        public List<Cont> ordonareConturi(List<Cont> conturi) {
            List<Cont> conturiOrdonate = new ArrayList<>();

             for (String numarCont : ordineConturi) {
                for (Cont cont : conturi) {
                    if (cont.getNumarCont().equals(numarCont)) {
                        conturiOrdonate.add(cont);
                        break;
                    }
                }
            }

            return conturiOrdonate;
        }
}
