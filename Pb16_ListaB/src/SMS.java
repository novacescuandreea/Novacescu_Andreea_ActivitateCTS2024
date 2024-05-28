public class SMS implements IObserver {
    private String SMS;

    public SMS(String SMS) {
        this.SMS = SMS;
    }

    @Override
    public void update(String message) {
        System.out.println("SMS-> " + SMS + ": " + message);
    }
}
