public class Main {
    public static void main(String[] args) {

        StarePacient pacient = new StarePacient("Novacescu A.", 28803152, "rea");

        Salon[] saloaneDisponibile = {
                new Salon("Salonul 1", 5),
                new Salon("Salonul 2", 15),
        };

        Salon salonAles = null;
        for (Salon salon : saloaneDisponibile) {
            if (salon.getCapacitateSalon() > 6) {
                salonAles = salon;
                break;
            }
        }

        if (salonAles != null) {
            FisaInternare fisaInternare = new FisaInternare(pacient, salonAles);

            System.out.println("Pacientul " + pacient.getNume() + " a fost internat in " + salonAles.getNumeSalon() + ".");
        }
    }
}
