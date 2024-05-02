public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Novacescu A.");
        pacient.executaStare();

        pacient.setStare(new SubObservatie());
        pacient.executaStare();

        pacient.setStare(new Externat());
        pacient.executaStare();
    }
}