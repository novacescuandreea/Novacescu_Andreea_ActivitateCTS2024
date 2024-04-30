public class Spital implements ISpitalInternare {

   @Override
    public boolean verificaAsigurareSanatate() {
        return false;
    }

    @Override
    public void internare() {
        System.out.println("Nu are asigurare deci nu se poate interna");
    }
}
