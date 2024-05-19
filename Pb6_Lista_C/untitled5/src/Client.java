public class Client {
    private String nume;
    private String idCardSanatate;

    public Client(String nume, String idCardSanatate) {
        this.nume = nume;
        this.idCardSanatate = idCardSanatate;
    }

    public String getNume() {
        return nume;
    }

    public String getIdCardSanatate() {
        return idCardSanatate;
    }
}
