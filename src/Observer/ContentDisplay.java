package Observer;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
class ContentDisplay implements NotificationDisplay {
    @Override
    public void display(List<Notification> notifications) {
        System.out.println("Contenu des notifications :");
        for (Notification notification : notifications) {
            System.out.println(notification.getContent());
        }
    }
}