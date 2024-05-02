public class Main {
    public static void main(String[] args) {


        Spital spital=new Spital("CFR");
        Pacient pacient1 = new Pacient("Novacescu");
        spital.aboneazaPacient(pacient1);

        Pacient pacient2 = new Pacient("Lungu");
        spital.aboneazaPacient(pacient2);

        spital.trimiteNotificare("Epidemie de virus1");
        spital.trimiteNotificare("Epidemie de virus2");
    }
}