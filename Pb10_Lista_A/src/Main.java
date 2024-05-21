public class Main {
    public static void main(String[] args) {

        IFlyweight factory = new PacientFlyweight();

        Pacient pacient1 = factory.getPacient("Andreea N.", 726379228, "Str. Alunului nr. 1");
        Salon salon1 = new Salon(15, 1, 5, pacient1);
        salon1.descriePacient();

        Pacient pacient2 = factory.getPacient("George L.", 732286039, "Str. Fagului nr. 2");
        Salon salon2 = new Salon(23, 2, 10, pacient2);
        salon2.descriePacient();
    }
}
