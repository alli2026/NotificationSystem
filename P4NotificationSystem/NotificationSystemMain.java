/**
 * The NotificationSystemMain class serves to test the functionality of the
 * Flexible Notification System application.
 * 
 * This class demonstrates how the AlertSystem uses composition to change
 * notifcation mediums by switching between different NotificationMedium
 * implementations (EmailService and SMSService). The program sends
 * notifications through both mediums and stores the messages in a log.
 * 
 * @author Alli Zheng
 * @version 1.0
 */

public class NotificationSystemMain {

    /**
     * The main method to run the Notification System application. It creates an
     * AlertSystem, sends notifications through different mediums, and retrieves the
     * message log.
     * 
     * @param args command-line arguments (not used in this application)
     */
    public static void main(String[] args) {

        // Create an AlertSystem with EmailService
        NotificationMedium email = new EmailService();
        AlertSystem alertSystem = new AlertSystem(email);

        // Send a notification using the EmailService
        alertSystem.notifyUser("This is an email notification.");

        // Change the notification medium to SMSService
        NotificationMedium sms = new SMSService();
        alertSystem.setMedium(sms);

        // Send a notification using the new SMSService
        alertSystem.notifyUser("This is an SMS notification.");

        // Retrieve and print the message log
        alertSystem.getMessageLog();

    }
    /*
     * ChatGPT was used as a tool to help with issues I encountered and the code
     * was updated using all of AI's suggestions where appropriate.
     * 
     * AI was used in the following ways:
     *
     * 1) I asked AI to clarify the assignment requirements related to the message
     * log.
     * I was unsure whether the program needed to prompt the user for input using a
     * Scanner or if the message log was simply intended to store and display the
     * notification messages sent through each medium. AI clarified that user input
     * was not required and that the purpose of the message log was to track the
     * notification
     * messages sent by the system. This helped me map out the structure of my main
     * method without needing to implement user input.
     * 
     * 
     * 2) I asked AI to help figure out the placement of the AlertSystem class on my
     * UML diagram.
     * I was unsure if it should be alongside the EmailService and SMSService
     * classes or underneath them.
     * If it goes underneath, is it proper to draw a line in-between the two
     * concrete classes to connect
     * it to the interface? AI explained that the AlertSystem class should go
     * underneath so I used
     * it's suggestion.
     * 
     * 3) I asked AI to review my documentation to ensure it was written clearly and
     * followed proper rules. Based on the suggestions, I updated the class
     * descriptions and method comments to improve clarity and correctness.
     */
}
