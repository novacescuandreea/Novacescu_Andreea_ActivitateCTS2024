public class AltCont extends Client{
    public AltCont(String nume, String adresa) {
        super(nume, adresa);
    }
    @Override
    public AltCont clone() throws CloneNotSupportedException {
        return (AltCont) super.clone();
    }
}