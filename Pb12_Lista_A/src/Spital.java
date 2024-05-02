import java.util.ArrayList;
import java.util.List;

public class Spital implements INotificare{
    private List<Pacient> pacienti;
    private String numeSpital;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
        this.pacienti = new ArrayList<>();
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (Pacient pacient : pacienti) {
            pacient.notificareVirusi(mesaj);
        }
    }

    public void aboneazaPacient(Pacient pacient) {
        pacienti.add(pacient);
    }

    
}
