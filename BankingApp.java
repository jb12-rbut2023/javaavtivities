import java.util.Scanner;
class BankAccount {
    private int userId;
    private int pin;
    private String name;
    private double balance;

    // Constructor to initialize the account
    public BankAccount(int userId, int pin, String name, double balance) {
        this.userId = userId;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Method to add money to the account
    public void cashIn(double amount) {
        balance += amount;
        System.out.println("Cash-in successful. Updated balance: $" + balance);
    }

    // Method to transfer money to another account
    public void moneyTransfer(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            recipient.cashIn(amount);
            System.out.println("Money transfer successful. Updated balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount for transfer.");
        }
    }

    // Method to validate login credentials
    public boolean validateLogin(int enteredPin) {
        return enteredPin == pin;
    }

    // Getter method for user ID
    public int getUserId() {
        return userId;
    }
}

public class BankingApp {
    public static void main(String[] args) {
        // Create BankAccount objects for two users
        BankAccount user1 = new BankAccount(412435, 7452, "Chris Sandoval", 32000);
        BankAccount user2 = new BankAccount(264863, 1349, "Marc Yim", 1000);
        BankAccount user3 = new BankAccount(190399, 1903, "Robert But", 5000);
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Login
        System.out.print("Enter User ID: ");
        int enteredUserId = scanner.nextInt();
        System.out.print("Enter PIN: ");
        int enteredPin = scanner.nextInt();

        // Check if the entered credentials are valid
        BankAccount loggedInUser = null;
        if (user1.getUserId() == enteredUserId && user1.validateLogin(enteredPin)) {
            loggedInUser = user1;
        } else if (user2.getUserId() == enteredUserId && user2.validateLogin(enteredPin)) {
            loggedInUser = user2;
        }else if (user3.getUserId() == enteredUserId && user3.validateLogin(enteredPin)){
           loggedInUser = user3;
        }
        else {
            System.out.println("Invalid credentials. Exiting...");
            System.exit(0);
        }

        // Display menu
        int choice;
        do {
            System.out.println("\n1. Check Balance\n2. Cash-in\n3. Money Transfer\n4. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Check Balance
                    System.out.println("Current Balance: $" + loggedInUser.checkBalance());
                    break;
                case 2:
                    // Cash-in
                    System.out.print("Enter the amount to add: $");
                    double cashInAmount = scanner.nextDouble();
                    loggedInUser.cashIn(cashInAmount);
                    break;
                case 3:
                    // Money Transfer
                    System.out.print("Enter recipient's User ID: ");
                    int recipientUserId = scanner.nextInt();
                    System.out.print("Enter the amount to transfer: $");
                    double transferAmount = scanner.nextDouble();

                    // Find the recipient account
                    BankAccount recipient = (recipientUserId == user1.getUserId()) ? user1 : ((recipientUserId == user2.getUserId()) ? user2 : user3);
                    loggedInUser.moneyTransfer(recipient, transferAmount);
                    break;
                case 4:
                    // Logout
                    System.out.println("Logged out. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);
        // Close the scanner
        scanner.close();
    }
}
