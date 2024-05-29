public class Cont {
    private String numarCont;
    private double sold;

    public Cont(String numarCont, double sold) {
        this.numarCont = numarCont;
        this.sold = sold;
    }

    public String getNumarCont() {
        return numarCont;
    }

    public double getSold() {
        return sold;
    }

    public void retrage(double suma) {
        sold = sold - suma;
    }
}
