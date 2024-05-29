import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cont> conturi = new ArrayList<>();
        conturi.add(new Cont("123456", 1000));
        conturi.add(new Cont("654321", 500));
        conturi.add(new Cont("987654", 2000));

        Client client = new Client("John Doe", conturi);

        client.setStrategieOrdineConturi(new OrdineSetata(Arrays.asList("654321", "987654", "123456")));

        boolean plataEfectuata = client.realizeazaPlata(700);
        if (plataEfectuata) {
            System.out.println("Plata a fost efectuata cu succes.");
        } else {
            System.out.println("Nu exista suficient sold pentru a realiza plata.");
        }
    }
}
