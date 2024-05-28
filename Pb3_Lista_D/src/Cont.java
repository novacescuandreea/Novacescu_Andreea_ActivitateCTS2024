public class Cont {
    private String numeClient;
    private boolean primeseSalariulOnline;
    private boolean areCard;
    private boolean areInternetBanking;

   public Cont(String numeClient, boolean primeseSalariulOnline, boolean areCard, boolean areInternetBanking) {
        this.numeClient = numeClient;
        this.primeseSalariulOnline = primeseSalariulOnline;
        this.areCard = areCard;
        this.areInternetBanking = areInternetBanking;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public boolean isPrimeseSalariulOnline() {
        return primeseSalariulOnline;
    }

    public boolean isAreCard() {
        return areCard;
    }

    public boolean isAreInternetBanking() {
        return areInternetBanking;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "numeClient='" + numeClient + '\'' +
                ", primeseSalariulOnline=" + primeseSalariulOnline +
                ", areCard=" + areCard +
                ", areInternetBanking=" + areInternetBanking +
                '}';
    }

    public Cont() {
    }

    public static Cont.ContBuilder builder() {
        return new Cont.ContBuilder();
    }

    public static class ContBuilder implements IBuilder {

       private Cont cont;

      public ContBuilder() {
            this.cont = new Cont();
      }

        public ContBuilder setNumeClient(String numeClient) {
            this.cont.numeClient = numeClient;
            return this;
        }

        public ContBuilder setPrimeseSalariulOnline(boolean primeseSalariulOnline) {
            this.cont.primeseSalariulOnline = primeseSalariulOnline;
            return this;
      }

        public ContBuilder setAreCard(boolean areCard) {
            this.cont.areCard = areCard;
            return this;
        }

        public ContBuilder setAreInternetBanking(boolean areInternetBanking) {
            this.cont.areInternetBanking = areInternetBanking;
            return this;
      }

        @Override
        public Cont build() {
            return this.cont;
        }
    }
}
