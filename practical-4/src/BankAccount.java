abstract public class BankAccount {
    public int accountNumber;
    public int addharNumber;
    public String ownerName;
    public double ROI;
    public double balance;
    public boolean isClosed;

    static int accountNumberSerialForFD = 55000;
    static int accountNumberSerialForSavingAccount = 11000;

    BankAccount(String ownerName, double balance, int addharNumber) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.addharNumber = addharNumber;
    }

    public void depositAccount(double amount) {

    }

    abstract public void closeAccount(boolean isLockedInPeroidOver);

    // abstract public void openAccount();

    abstract public void updateInterest();
}
