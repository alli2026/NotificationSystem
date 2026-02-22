/**
 * This interface is a simple notification medium that can send a message by
 * implementing Email, SMS, or WhatsApp notification services.
 * 
 * @author Alli Zheng
 * @version 2.0
 * 
 */

public interface NotificationMedium {

    /**
     * Sends a message through the notification medium.
     * 
     * @param message the message to be sent
     */

    void send(String message);
}
