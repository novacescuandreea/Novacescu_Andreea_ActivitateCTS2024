public class ContClient {
    private int varsta;

    public ContClient(int varsta) {
        this.varsta = varsta;
    }

    public static boolean confirmaVerificare(ContClient contClient) {
        return contClient.varsta >= 18;
    }
}
