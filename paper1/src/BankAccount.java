public class BankAccount {
    private String name;
    private int accountNumber;
    private int balance;

    BankAccount(String name,int accountNumber,int balance){
        setName(name);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void withdraw(int amount){
        if(amount<balance){
            setBalance(balance-amount);
        }
        System.out.println(amount+" withdrawn successfully");
    }

    public void deposit(int amount){
        setBalance(balance+amount);
        System.out.println(amount+" deposited successfully");
    }

    public void transfer(BankAccount reciever,int amount){
        if(this.balance>amount){
            reciever.deposit(amount);
            System.out.println(amount+" transfered to "+reciever.name+" successfully");
        }
        setBalance(balance-amount);
    }

    public String toString(){
        return "Name: "+name+"\nAccount Number: "+accountNumber+"\nBalance: "+balance+"\n";
    }
}
