import java.util.ArrayList;

/**
 * The AlertSystem class uses composition to work with any NotificationMedium
 * implementation.
 * 
 * It has a NotificationMedium object field that can be set to either
 * EmailService or SMSService, allowing it to send notifications through
 * the chosen medium. It also contains a message log of all sent messages.
 * 
 * @author Alli Zheng
 * @version 1.0
 */

public class AlertSystem {

    /** The current medium used to send notifications. */
    private NotificationMedium medium;

    /** Implements ArrayList to store and retrieve all sent messages. */
    private ArrayList<String> messageLog;

    /**
     * Creates a new AlertSystem with an initialized notification medium and message
     * log.
     * 
     * @param medium the initial notification medium to use for notifications
     */
    public AlertSystem(NotificationMedium medium) {
        this.medium = medium;
        this.messageLog = new ArrayList<>();
    }

    /**
     * Changes the notification medium used by the AlertSystem.
     * 
     * @param medium the new notification medium to use
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
        System.out.println("Notification medium changed.");
    }

    /**
     * Sends a notification message using the current notification medium and logs
     * the message.
     * 
     * @param message the message to be sent as a notification
     */
    public void notifyUser(String message) {
        if (medium != null) {
            medium.send(message);
            messageLog.add(message);
        } else {
            System.out.println("No notification medium set.");
        }
    }

    /**
     * Prints the log of all sent messages. If no messages have been sent, it
     * indicates that the log is empty.
     */
    public void getMessageLog() {
        if (messageLog.isEmpty()) {
            System.out.println("Message log is empty.");
        } else {
            System.out.println("Message Log:");
            for (String message : messageLog) {
                System.out.println(message);
            }
        }
    }
}
