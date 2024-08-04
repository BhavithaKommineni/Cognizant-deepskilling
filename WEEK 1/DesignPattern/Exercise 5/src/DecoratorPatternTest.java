// DecoratorPatternTest.java
public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create an EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate the email notifier with SMS notifications
        Notifier emailAndSMSNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorate the previous notifier with Slack notifications
        Notifier multiChannelNotifier = new SlackNotifierDecorator(emailAndSMSNotifier);

        // Send a notification through all channels
        multiChannelNotifier.send("Hello, this is a multi-channel notification!");

        // Send a notification through email and SMS only
        emailAndSMSNotifier.send("Hello, this is an email and SMS notification!");

        // Send a notification through email only
        emailNotifier.send("Hello, this is an email notification!");
    }
}
