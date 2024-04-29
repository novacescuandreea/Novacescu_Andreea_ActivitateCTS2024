public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Novacescu Andreea", 36, "Ok");
        Medic medic = new Medic();
        Salon salon = new Salon(2); //
        Spital spital = new Spital(salon);

        Facade facade = new Facade(pacient, medic, spital);
        boolean poateFiInternat = facade.verificaInternare();

        if (poateFiInternat) {
            System.out.println("Pacientul necesita internare");
            salon.ocupaPat();
        } else {
            System.out.println("Pacientul nu necesita internare");
        }
    }
}