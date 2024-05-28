public class Email implements IObserver {
    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Email -> " + email + ": " + message);
    }
}