public class Person {
    private String name;
    private int age;

    // Default constructor that calls the parameterized constructor with default values
    public Person() {
        this("Unknown", 0);
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println();
    }

    public static void main(String[] args) {
        // Create objects using both constructors
        Person person1 = new Person();
        person1.displayPersonDetails();

        Person person2 = new Person("John Doe", 30);
        person2.displayPersonDetails();
    }
}