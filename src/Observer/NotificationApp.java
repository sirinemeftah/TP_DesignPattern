package Observer;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
public class NotificationApp implements Observer {
    private NotificationDisplay countDisplay = new CountDisplay();
    private NotificationDisplay contentDisplay = new ContentDisplay();

    public NotificationApp(NotificationManager notificationManager) {
        notificationManager.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        List<Notification> notifications = (List<Notification>) arg;
        countDisplay.display(notifications);
        contentDisplay.display(notifications);
    }}