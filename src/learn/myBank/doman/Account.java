package learn.myBank.doman;

/**
 * Bank Account class
 */

public class Account {

    protected double balance;

    /**
     *
     * constructor that provides initial balance
     * balance must be positive account balance
     */
    protected Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else this.balance = 0;
    } // end Account()

    public Account() {
        this.balance = 0;
    } // end Account()

    /**
     * Method to add money to account
     * @param amt a positive amount of money
     */
    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return  true;
        }
        return false;
    } // end deposit()

    /**
     * Method to withdraw money
     * @param amt a positive amount of money
     */
    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            return true;
        }
        return  false;

    } // end withdraw()

    /**
     * Method to check account balance
     * @return the balance
     */
    public double getBalance() {
        return balance;
    } // end getBalance()
}
