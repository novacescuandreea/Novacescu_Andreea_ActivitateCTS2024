public class Sectii extends ANod {
    String denumireSectii;

    public Sectii(String denumireSectii){
        this.denumireSectii = denumireSectii;

    }

    @Override
    public String getDenumire() {
        return this.denumireSectii;
    }

}
