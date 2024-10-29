package observers;

public class NotificationObserver implements Observer {
    private String userName;

    public NotificationObserver(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {
        System.out.println(userName + " received notification: " + message);
    }
}
