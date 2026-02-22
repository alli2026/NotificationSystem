/**
 * EmailService class that implements the NotificationMedium interface to send
 * notifications via email.
 * 
 * @author Alli Zheng
 * @version 1.0
 */

public class EmailService implements NotificationMedium {

    /**
     * Sends a message as an email notification.
     * 
     * @param message the message to be sent by email
     */
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }

}
