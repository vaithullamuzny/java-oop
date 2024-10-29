public class q9 {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    // Default constructor
    public q9() {
        this.accountNumber = 0;
        this.accountHolder = "Unknown";
        this.balance = 0.0;
    }

    // Parameterized constructor
    public q9(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Create a BankAccount object using the parameterized constructor
        q9 account = new q9(12345, "John Doe", 1000.0);

        // Display the account information
        account.displayAccountInfo();
    }
}