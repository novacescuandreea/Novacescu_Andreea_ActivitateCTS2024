public class Spital {
    private int nrPersoane;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciDeCamera;
    private boolean areHalatPentruInterior;

    public int getNrPersoane() {
        return nrPersoane;
    }

    public boolean isArePatRabatabil() {
        return arePatRabatabil;
    }

    public boolean isAreMicDejunInclus() {
        return areMicDejunInclus;
    }

    public boolean isArePapuciDeCamera() {
        return arePapuciDeCamera;
    }

    public boolean isAreHalatPentruInterior() {
        return areHalatPentruInterior;
    }

    @Override
    public String toString() {
        return "Spital{" +
                "nrPersoane=" + nrPersoane +
                ", arePatRabatabil=" + arePatRabatabil +
                ", areMicDejunInclus=" + areMicDejunInclus +
                ", arePapuciDeCamera=" + arePapuciDeCamera +
                ", areHalatPentruInterior=" + areHalatPentruInterior +
                '}';
    }

    private Spital(){
    }

    public static Spital.SpitalBuilder builder() {
        return new Spital.SpitalBuilder();
    }

    public static class SpitalBuilder implements IBuilder {
        private Spital spital;

        public SpitalBuilder() {
            this.spital = new Spital();
        }

        public SpitalBuilder setNrPersoane(int nrPersoane) {
            this.spital.nrPersoane = nrPersoane;
            return this;
        }

        public SpitalBuilder setArePatRabatabil(boolean arePatRabatabil) {
            this.spital.arePatRabatabil = arePatRabatabil;
            return this;
        }

        public SpitalBuilder setAreMicDejunInclus(boolean areMicDejunInclus) {
            this.spital.areMicDejunInclus = areMicDejunInclus;
            return this;
        }

        public SpitalBuilder setArePapuciDeCamera(boolean arePapuciDeCamera) {
            this.spital.arePapuciDeCamera = arePapuciDeCamera;
            return this;
        }

        public SpitalBuilder setAreHalatPentruInterior(boolean areHalatPentruInterior) {
            this.spital.areHalatPentruInterior = areHalatPentruInterior;
            return this;
        }

        @Override public Spital build(){
            return this.spital;
        }

    }
}
