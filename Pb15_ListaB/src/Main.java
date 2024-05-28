//chain of responsability
public class Main {
    public static void main(String[] args) {
    Operator op1 = new Operator();
    Operator op2 = new Operator();

    op1.setVerificare(op2);

        ModulComenzi modulComenzi1 = new ModulComenzi("Pizza 1",4);
        ModulComenzi modulComenzi2 = new ModulComenzi("Pizza 1",5);

        System.out.println("Operator");
        op1.procesareModulComenzi(modulComenzi1);
        op1.procesareModulComenzi(modulComenzi2);

        System.out.println("Manager");
        op2.procesareModulComenzi(modulComenzi1);
        op2.procesareModulComenzi(modulComenzi2);
    }
}
