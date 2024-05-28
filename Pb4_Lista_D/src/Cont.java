public class Cont extends Client{
    private double sold;
    public Cont(String nume, String adresa, double sold) {
        super(nume, adresa);
        this.sold = sold;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    @Override
    public Client clone() throws CloneNotSupportedException{
        return (Cont) super.clone();
    }
}
