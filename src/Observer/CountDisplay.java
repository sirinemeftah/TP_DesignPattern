package Observer;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
class CountDisplay implements NotificationDisplay {
    @Override
    public void display(List<Notification> notifications) {
        System.out.println("Nombre de notifications : " + notifications.size());
    }
}