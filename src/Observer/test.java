package Observer;

public class test {
	public static void main(String[] args) {
        NotificationManager notificationManager = new NotificationManager();
        NotificationApp notificationApp = new NotificationApp(notificationManager);

        notificationManager.addNotification(new Notification("Notification 1"));
        notificationManager.addNotification(new Notification("Notification 2"));
        notificationManager.addNotification(new Notification("Notification 3"));
    }

}
