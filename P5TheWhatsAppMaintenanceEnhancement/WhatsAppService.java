/**
 * WhatsAppService class implements the NotificationMedium interface to send
 * notifications via WhatsApp.
 * 
 * @author Alli Zheng
 * @version 2.0
 */

public class WhatsAppService implements NotificationMedium {

    /**
     * Sends a message as a WhatsApp notification.
     * 
     * @param message the message to be sent by WhatsApp
     */
    @Override
    public void send(String message) {
        System.out.println("[WhatsApp] Sending message: " + message);
    }

}
