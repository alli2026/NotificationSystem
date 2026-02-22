/**
 * The NotificationSystemMain class serves to test the functionality of the
 * Flexible Notification System application.
 * 
 * This class demonstrates how the AlertSystem uses composition to change
 * notification mediums by switching between different NotificationMedium
 * implementations (EmailService, SMSService, and WhatsAppService). The program
 * sends
 * notifications through all three mediums and stores the messages in a log.
 * 
 * @author Alli Zheng
 * @version 2.0
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

        // Change the notification medium back to WhatsAppService
        NotificationMedium whatsapp = new WhatsAppService();
        alertSystem.setMedium(whatsapp);

        // Send a notification using the new WhatsAppService
        alertSystem.notifyUser("This is a WhatsApp notification.");

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
     * log. I was unsure whether the program needed to prompt the user for input
     * using a Scanner or if the message log was simply intended to store and
     * display
     * the notification messages sent through each medium. AI clarified that user
     * input
     * was not required and that the purpose of the message log was to track the
     * notification messages sent by the system. This helped me map out the
     * structure
     * of my main method without needing to implement user input.
     * 
     * 2) I asked AI to help figure out the placement of the AlertSystem class on my
     * UML diagram. I was unsure if it should be alongside the EmailService and
     * SMSService classes or underneath them. If it goes underneath, is it proper to
     * draw a line in-between the two concrete classes to connect it to the
     * interface?
     * AI explained that the AlertSystem class should go underneath so I used
     * it's suggestion.
     * 
     * 3) I asked AI to review my documentation to ensure it was written clearly and
     * followed proper rules. Based on the suggestions, I updated the class
     * descriptions and method comments to improve clarity and correctness.
     * 
     * Verison 2.0 of my program uses AI to generate the WhatsAppService class and
     * test script.
     * 
     * 1) I asked AI to create a class called WhatsAppService that implements the
     * NotificationMedium interface and have the send method output "[WhatsApp]
     * Sending message: <message>." I asked AI to not modify AlertSystem
     * or NotificationMedium to ensure that the new class would work with the
     * existing code without any changes and to create a test script in the main
     * method to test the new WhatsAppService class. The AI output was accurate
     * and worked properly with the existing code without adding or changing any
     * methods in the existing interface.
     * 
     * 2) I asked AI if I should update the @version to 2.0 in my documentation for
     * all of my classes even though I did not make changes to every class. AI
     * explained that since I made updates to the program by adding a new
     * notification medium and updating the documentation, it would be appropriate
     * to update the version number to 2.0 for all classes to reflect the overall
     * changes made to the program. I updated the version number in all of my
     * classes to 2.0 based on this suggestion.
     * 
     * 3) I asked AI if my docs folder would update automatically with the html
     * files since I made changes to my code and documentation. AI explained that
     * the docs folder would not update automatically and that I would need to
     * regenerate the Javadoc HTML files after making changes to my code or
     * documentation to ensure that the docs folder reflects the latest version
     * of my program. I regenerated the Javadoc HTML files to update the docs
     * folder with the latest changes using AI's suggestion of the command
     * "javadoc -d docs src/*.java" in the terminal.
     */
}
