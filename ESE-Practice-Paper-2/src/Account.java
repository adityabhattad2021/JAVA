public class Account {
    private String name;
    private String address;
    private String accountNumber;
    private double balance;

    public Account(String name, String address, String accountNumber, double balance) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println(String.format("\nAmount Deposited: %.2f\n", amount));
        this.balance += amount;
    }

    public void withdraw(double amount) {
        try {
            if (amount < this.balance) {
                System.out.println(String.format("Amount Withdrawn: %.2f", amount));
                this.balance -= amount;
            } else {
                throw new InsufficientFundsException(
                        String.format("You do not have sufficient funds.\nCurrent Balance: %.2f", this.balance));
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public String toString() {
        return String.format(
                "\n\nAccount Holder Name: %s\nAccount Holder Address: %s\nAccount Holder Account Number: %s\nAccount Holder Balance: %.2f",
                this.name, this.address, this.accountNumber, this.balance);
    }
}
