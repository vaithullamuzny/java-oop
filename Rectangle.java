public class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
        System.out.println("Default Rectangle created:");
        displayRectangleDetails();
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Custom Rectangle created:");
        displayRectangleDetails();
    }

    // Method to display rectangle details
    private void displayRectangleDetails() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + calculateArea());
        System.out.println();
    }

    // Method to calculate the area of the rectangle
    private double calculateArea() {
        return this.length * this.width;
    }

    public static void main(String[] args) {
        // Create objects using both constructors
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5.0, 3.0);
    }
}
