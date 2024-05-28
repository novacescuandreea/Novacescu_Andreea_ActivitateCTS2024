public class Banca {
    private String numeClient;
    private String tipCredit;

    public Banca(String numeClient, String tipCredit) {
        this.numeClient = numeClient;
        this.tipCredit = tipCredit;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getTipCredit() {
        return tipCredit;
    }

    @Override
    public String toString() {
        return "Banca{" +
                "numeClient='" + numeClient + '\'' +
                ", tipCredit='" + tipCredit + '\'' +
                '}';
    }

    public Banca() {
    }

    public static Banca.BancaBuilder builder() {
        return new Banca.BancaBuilder();
    }

    public static class BancaBuilder implements IBuilder {
        private Banca banca;

        public BancaBuilder() {
            this.banca = new Banca();
        }

        public BancaBuilder setNumeClient(String numeClient) {
            this.banca.numeClient = numeClient;
            return this;
        }

        public BancaBuilder setTipCredit(String tipCredit) {
            this.banca.tipCredit = tipCredit;
            return this;
        }

        @Override
        public Banca build() {
            return this.banca;
        }

    }

}