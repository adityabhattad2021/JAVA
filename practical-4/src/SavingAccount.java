public class SavingAccount extends BankAccount implements Debitable {

    SavingAccount(int accountNumber,int adharNumber,String ownerName,double balance){
        super(ownerName,balance,adharNumber);
        this.ROI = 4;
        setAccountNumber();
    }


    public void setAccountNumber(){
        this.accountNumber = super.accountNumberSerialForSavingAccount;
        super.accountNumberSerialForSavingAccount++;
    }

    public void updateInterest(){
        double yeildedInterest = balance*(this.ROI/100);
        this.balance += yeildedInterest;
    }

    public double withdraw(double amountToBeWithdrawn){
        if(super.balance>amountToBeWithdrawn){
            super.balance-=amountToBeWithdrawn;
            return amountToBeWithdrawn;
        }
        return -1;
        // throw new Exception("Not enough balance");
    }   

    public void closeAccount(boolean isLockedInPeroidOver){
        this.isClosed=true;
    }

    public void depositAccount(double amount){
        this.balance+=amount;
    }  
    
    @Override 
    public String toString(){
        return "Account Number: "+this.accountNumber+".\nHolders Addhar Number: "+this.addharNumber+".\nHolder Name: "+this.ownerName+".\nTotalAvailable Balance: "+this.balance+".\n";
    }



}
