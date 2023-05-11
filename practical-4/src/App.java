public class App {
    public static void main(String[] args) throws Exception {
        FixedDepositAccount fd1 = new FixedDepositAccount("Rahul Varma", 50000, 2, 1234);
        FixedDepositAccount fd2 = new FixedDepositAccount("Smith Jadhav", 100000, 5, 5678);
        SavingAccount sa1 = new SavingAccount(11001, 1234, "Pradeen Rathod", 20000);
        SavingAccount sa2 = new SavingAccount(11002, 5678, "Vivek Goyal", 50000);

        System.out.println("Initial Account Details:\n");
        System.out.println(fd1);
        System.out.println(fd2);
        System.out.println(sa1);
        System.out.println(sa2);

        fd1.updateInterest();
        fd2.updateInterest();
        sa1.updateInterest();
        sa2.updateInterest();

        fd1.closeAccount(false);
        fd2.closeAccount(true);

        sa1.depositAccount(10000);
        sa1.withdraw(5000);
        sa2.withdraw(60000);

        System.out.println("\nUpdated Account Details:\n");
        System.out.println(fd1);
        System.out.println(fd2);
        System.out.println(sa1);
        System.out.println(sa2);
    }
}
