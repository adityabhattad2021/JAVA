public class FixedDepositAccount extends BankAccount {
    public double lockedInPeriod;

    FixedDepositAccount(String ownerName,double balance,double lockedInPeriod,int addharNumber){
        super(ownerName,balance,addharNumber);
        this.lockedInPeriod=lockedInPeriod;
        if(lockedInPeriod<2){
            this.ROI = 6;
        }else if(lockedInPeriod<5){
            this.ROI = 6.5;
        } else if(lockedInPeriod>=5){
            this.ROI = 7;
        }
        setAccountNumber();
    }

    public void setAccountNumber(){
        this.accountNumber = super.accountNumeberSerialForFD;
        super.accountNumeberSerialForFD++;
    }

    @Override
    public void updateInterest(){
        double yeildedInterest = balance*(this.ROI/100);
        this.balance+=yeildedInterest;   
    }

    @Override
    public void closeAccount(boolean isLockedInPeroidOver){
        if(!isLockedInPeroidOver){
            double deductableAmount = this.balance*(4/100);
            this.balance-=deductableAmount;
        }
    }

    @Override 
    public String toString(){
        return "Account Number: "+this.accountNumber+".\nHolders Addhar NUmber: "+this.addharNumber+".\nHolder Name: "+this.ownerName+".\nLocked In period: "+this.lockedInPeriod+".\nTotalAvailable Balance: "+this.balance+".\n";
    }

}
