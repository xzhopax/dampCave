package learn.myBank.doman;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(double initBalance, double interestRate){
        this.balance = initBalance;
        this.interestRate = interestRate;

    }
}
