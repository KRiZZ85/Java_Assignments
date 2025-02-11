import java.util.Scanner; // Import Scanner for user input

public class Rectangle {
    // Attributes with default values
    private double length = 1.0;
    private double width = 1.0;

    // Setter for length
    public void setLength(double length) {
        if (length > 0) { // Validate input
            this.length = length;
        } else {
            System.out.println("Invalid length. Length must be greater than 0.");
        }
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for width
    public void setWidth(double width) {
        if (width > 0) { // Validate input
            this.width = width;
        } else {
            System.out.println("Invalid width. Width must be greater than 0.");
        }
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Main method to take user input and demonstrate the class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle();

        // Prompt user for length
        System.out.print("Enter the length of the rectangle (default is 1): ");
        double length = scanner.nextDouble();
        rectangle.setLength(length); // Set length

        // Prompt user for width
        System.out.print("Enter the width of the rectangle (default is 1): ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width); // Set width

        // Display the dimensions and area
        System.out.println("\nRectangle Details:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());

        scanner.close(); // Close the scanner
    }
}