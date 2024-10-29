public class Employee {
    private String name;
    private int id;
    private double salary;

    // Default constructor
    public Employee() {
        this.name = "";
        this.id = 0;
        this.salary = 0.0;
        displayEmployeeDetails();
    }

    // Parameterized constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        displayEmployeeDetails();
    }

    // Method to display employee details
    private void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
    }

    public static void main(String[] args) {
        // Create an object using the parameterized constructor
        Employee employee = new Employee("John Doe", 1234, 50000.0);

        // Output:
        // Employee Details:
        // Name: John Doe
        // ID: 1234
        // Salary: 50000.0
    }
}
