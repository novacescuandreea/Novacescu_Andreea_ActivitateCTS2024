public class Client {
    private boolean areReteta;

    public Client(boolean areReteta) {
        this.areReteta = areReteta;
    }

    public boolean areReteta() {
        return areReteta;
    }

    public void setAreReteta(boolean areReteta) {
        this.areReteta = areReteta;
    }

    @Override
    public String toString() {
        return "Pacient{are Reteta=" + areReteta + "}";
    }

}
