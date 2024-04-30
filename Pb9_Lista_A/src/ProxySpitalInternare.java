public class ProxySpitalInternare implements ISpitalInternare {
    private Spital spital;

   public ProxySpitalInternare(Spital spital) {
        this.spital = spital;
    }

    @Override
    public boolean verificaAsigurareSanatate() {
        return false;
    }

    public void internare() {
        System.out.println("Pacientul nu are asigurare de sanatate si nu poate fi internat.");
    }
}

