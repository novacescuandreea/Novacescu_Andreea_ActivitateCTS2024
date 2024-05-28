public class Main {
    public static void main(String[] args) {
        Operator operatorPrimire = new Operator();
        Pacient pacient1 = new Pacient("Andreea N.");
        operatorPrimire.primestePacient(pacient1, new ComenziInternare(pacient1));

        Pacient pacient2= new Pacient("Lungu G.");
        operatorPrimire.primestePacient(pacient2, new ComenziTratareImediata(pacient2));
    }
}