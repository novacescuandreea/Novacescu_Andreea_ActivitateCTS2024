public class Rezervare {
    private int nrPersoane;
    private String genMuzica;
    private boolean areAsezareLaGeam;
    private boolean areScauneErgonomice;
    private boolean areMasaDecorata;
    private boolean areMuzicaAmbientalaPersonalizata;

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

     public boolean isAreAsezareLaGeam() {
        return areAsezareLaGeam;
    }

    public void setAreAsezareLaGeam(boolean areAsezareLaGeam) {
        this.areAsezareLaGeam = areAsezareLaGeam;
    }

    public boolean isAreScauneErgonomice() {
        return areScauneErgonomice;
    }

    public void setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice = areScauneErgonomice;
    }

    public boolean isAreMasaDecorata() {
        return areMasaDecorata;
    }

    public void setAreMasaDecorata(boolean areMasaDecorata) {
        this.areMasaDecorata = areMasaDecorata;
    }

    public boolean isAreMuzicaAmbientalaPersonalizata() {
        return areMuzicaAmbientalaPersonalizata;
    }

    public void setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                ", areAsezareLaGeam=" + areAsezareLaGeam +
                ", areScauneErgonomice=" + areScauneErgonomice +
                ", areMasaDecorata=" + areMasaDecorata +
                ", areMuzicaAmbientalaPersonalizata=" + areMuzicaAmbientalaPersonalizata +
                '}';
    }

    private Rezervare() {
    }

    public static Rezervare.RezervareBuilder builder() {
        return new Rezervare.RezervareBuilder();
    }

    public static class RezervareBuilder implements IBuilder {
        private Rezervare rezervare;

        public RezervareBuilder() {
            this.rezervare = new Rezervare();
        }

        public RezervareBuilder setNrPersoane(int nrPersoane) {
            this.rezervare.nrPersoane = nrPersoane;
            return this;
        }

        public RezervareBuilder setAreAsezareLaGeam(boolean areAsezareLaGeam) {
            this.rezervare.areAsezareLaGeam = areAsezareLaGeam;
            return this;
        }

        public RezervareBuilder setAreScauneErgonomice(boolean areScauneErgonomice) {
            this.rezervare.areScauneErgonomice = areScauneErgonomice;
            return this;
        }

        public RezervareBuilder setAreMasaDecorata(boolean areMasaDecorata) {
            this.rezervare.areMasaDecorata = areMasaDecorata;
            return this;
        }

        public RezervareBuilder setAreMuzicaAmbientalaPersonalizat(boolean areMuzicaAmbientalaPersonalizat) {
            this.rezervare.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizat;
            return this;
        }

        @Override
        public Rezervare build() {
            return this.rezervare;
        }

    }
}
