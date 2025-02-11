import java.util.Scanner; // Import Scanner for user input

public class MessagePrinter {

    // Method to print the message
    public void printMessage(String name) {
        System.out.println("Hello " + name);
    }

    // Main method to take user input and call printMessage
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Prompt user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read user input

        // Create object of MessagePrinter
        MessagePrinter printer = new MessagePrinter();

        // Call the printMessage method
        printer.printMessage(name);

        scanner.close(); // Close the scanner
    }
}