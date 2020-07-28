package learn.myBank.doman;

public class Customer {

    private Account [] accounts;
    private String fullName;
    private int customerNumber;
    private static int customerNumberBase = 1000;
    private int numOfAccounts;

    public Customer(String fullName){
        accounts = new Account[10];
        this.fullName = fullName;
        this.customerNumber = customerNumberBase++;
        this.numOfAccounts = 0;

    }

    public Account getAccount(int accNo){
        if (accNo < accounts.length && numOfAccounts != 0){
            return accounts[accNo];
        }
        return null;
    }

    public void addAccount(Account acc){
        accounts[numOfAccounts] = acc;
        numOfAccounts++;
    }

    @Override
    public String toString() {
        String str = "Customer{" +
                "fullName='" + fullName + '\'' +
                ", customerNumber=" + customerNumber +
                ", numOfAccounts=" + numOfAccounts +
                '}';
        for (int i = 0; i < this.numOfAccounts; i++) {
            Account acc = getAccount(i);
            if (acc instanceof SavingsAccount){
                str = str + "\n\t" + (i + 1) +" Savings account with interest %"+((SavingsAccount) acc).getInterestRate();
            } else {
                str = str + "\n\t" + (i + 1) +" Checking account with overdraft %"+((CheckingAccount) acc).getOverdraftAmount();
            }
            str = str + ", balance $" + acc.getBalance();
        }
        str = str + "\n";
        return str;
    }
}
