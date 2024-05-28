public class Operator extends Verificare {
    @Override
    void procesareModulComenzi(ModulComenzi modulComenzi) {
        if (modulComenzi.getNr() < 5) {
            System.out.println("Responsabilul este operatorul");
        } else {
            System.out.println("Responsabilul este managerul");

            if (this.getVerificare() != null) {
                this.getVerificare().procesareModulComenzi(modulComenzi);
            }
        }
    }
}
