public class Main {
    public static void main(String[] args) {
        Notification[] notifications = {
                new EmailNotification("Harsh", "Welcome to our platform!"),
                new SMSNotification("Kush", "Your OTP is 456789"),
                new PushNotification("Prakhar", "You have a new friend request."),
                new EmailNotification("Aman", "Your order has been shipped.")
        };

        System.out.println("------ Sending Notifications ------");

        for (Notification n : notifications) {
            n.sendNotification();
            System.out.println("-----------------------------");
        }

        System.out.println("All notifications have been sent successfully.");
    }
}