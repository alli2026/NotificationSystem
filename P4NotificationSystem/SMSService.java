/**
 * SMSService class that implements the NotificationMedium interface to send SMS
 * notifications.
 * 
 * @author Alli Zheng
 * @version 1.0
 */

public class SMSService implements NotificationMedium {

    /**
     * Sends a message as an SMS notification.
     * 
     * @param message the message to be sent by SMS
     */
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }

}
