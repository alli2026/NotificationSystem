# NotificationSystem
Flexible Notification System (Project 4 - NotificationMedium, Project 5 - WhatsApp enhancement)

Project Purpose: The Flexible Notification System is a Java application that allows messages to be sent using composition in AlertSystem to switch between different notification mediums. 

This application is capable of extending the system's functionality by adding a new notification medium called WhatsAppService, without modifying the core engine. This follows the Open-closed principle and allows other developers to successfully takeover and have "ownership."

Quick Start: 
1. Download a copy of the folder: P4NotificationSystem.
2. Open the folder: P4NotificationSystem.
3. Open 'NotificationSystemMain.java'.
4. Click Run in your IDE.

5. Download a copy of the folder: P5TheWhatsAppMaintenanceEnhancement.
6. Open the folder: P5TheWhatsAppMaintenanceEnhancement
7. Open 'NotificationSystemMain.java'.
8. Click Run in your IDE.

More details on how to run the project can be found in TestingSuite.md.

Prerequisites: MacOS, Windows, Linux, or any other OS that supports Java. Java JDK 17+ installed or any Java IDE.  

Dependency Management: No external dependencies or external libraries required. Java JDK 17+ required.

Documentation (Architecure Overview): This project uses the Strategy design pattern. The NotificationMedium interface defines how notifications are sent, and each concrete class provides it's own implementation. The AlertSystem class uses composition by holding a NotificationMedium object instead of inheriting from it. This allows the notification method to be changed at runtime without modifying the AlertSystem class. This design supports the Open–Closed Principle, allowing new notification mediums to be added by creating new classes without modifying the existing system.

