public class Reteta {
    private int numarPungi;
    private boolean plataCuCard;
    private boolean cash;
    private boolean cardDeFidelitate;
    private boolean cotaTVA;
    private boolean platitorTVA;

    public int getNumarPungi() {
        return numarPungi;
    }

    public void setNumarPungi(int numarPungi) {
        this.numarPungi = numarPungi;
    }

    public boolean isPlataCuCard() {
        return plataCuCard;
    }

    public void setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
    }

    public boolean isCash() {
        return cash;
    }

    public void setCash(boolean cash) {
        this.cash = cash;
    }

    public boolean isCardDeFidelitate() {
        return cardDeFidelitate;
    }

    public void setCardDeFidelitate(boolean cardDeFidelitate) {
        this.cardDeFidelitate = cardDeFidelitate;
    }

    public boolean isCotaTVA() {
        return cotaTVA;
    }

    public void setCotaTVA(boolean cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    public boolean isPlatitorTVA() {
        return platitorTVA;
    }

    public void setPlatitorTVA(boolean platitorTVA) {
        this.platitorTVA = platitorTVA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numarPungi=").append(numarPungi);
        sb.append(", plataCuCard=").append(plataCuCard);
        sb.append(", cash=").append(cash);
        sb.append(", cardDeFidelitate=").append(cardDeFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append(", platitorTVA=").append(platitorTVA);
        sb.append('}');
        return sb.toString();
    }

    private Reteta(){

    }

    public static class RetetaBuilder implements IBuilder{

      private Reteta reteta;

      public RetetaBuilder() {
            this.reteta = new Reteta();
        }

      public RetetaBuilder setNumarPungi(int numarPungi) {
        this.reteta.numarPungi = numarPungi;
        return this;
      }

      public RetetaBuilder setAreCash(boolean cash) {
          this.reteta.cash = cash;
          return this;
      }

        public RetetaBuilder setAreCardDeFidelitate(boolean cardDeFidelitate) {
            this.reteta.cardDeFidelitate = cardDeFidelitate;
            return this;
        }

        public RetetaBuilder setArePlataCuCardul(boolean plataCuCardul) {
            this.reteta.plataCuCard = plataCuCardul;
            return this;
        }

        public RetetaBuilder setCotaTva(boolean cotaTva) {
            this.reteta.cotaTVA = cotaTva;
            return this;
        }

        public RetetaBuilder setPlatitorDeTVA(boolean platitorDeTVA) {
            this.reteta.platitorTVA = platitorDeTVA;
            return this;
        }

        @Override public Reteta build(){
            return this.reteta;
        }

    }

    public static Reteta.RetetaBuilder builder() {
        return new Reteta.RetetaBuilder();
    }
}
