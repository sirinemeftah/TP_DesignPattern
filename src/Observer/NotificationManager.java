package Observer;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
class NotificationManager extends Observable {
    private List<Notification> notifications = new ArrayList<>();

    public void addNotification(Notification notification) {
        notifications.add(notification);
        setChanged();
        notifyObservers(notifications);
    }
}