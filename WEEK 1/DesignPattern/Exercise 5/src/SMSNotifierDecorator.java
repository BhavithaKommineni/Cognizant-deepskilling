public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        notifier.send(message);
        sendSMSNotification(message);
    }

    private void sendSMSNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}

