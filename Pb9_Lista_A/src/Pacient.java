public class Pacient {
    private boolean areAsigurareSanatate;

    public Pacient(boolean areAsigurareSanatate) {
        this.areAsigurareSanatate = areAsigurareSanatate;
    }

    public boolean areAsigurareSanatate() {
        return areAsigurareSanatate;
    }

    @Override
    public String toString() {
        return "Pacient{areAsigurareSanatate=" + areAsigurareSanatate + "}";
    }

}
