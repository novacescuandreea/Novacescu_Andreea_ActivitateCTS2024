public class Facade {
    private ContClient contClient;
    private Operator operator;

    public Facade(ContClient contClient, Operator operator) {
        this.contClient = contClient;
        this.operator = operator;
    }

    public boolean verificaVarsta() {
        if (ContClient.confirmaVerificare(contClient)) {
            return operator.verificaClient();
        }
        return false;
    }
}
