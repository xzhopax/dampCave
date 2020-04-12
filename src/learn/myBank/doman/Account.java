package learn.myBank.doman;

/**
 * Bank Account class
 */

public class Account {

    private double balance;

    /**
     *
     * constructor that provides initial balance
     * balance must be positive account balance
     */
    public Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else this.balance = 0;
    }

    /**
     * Method to add money to account
     * @param amt a positive amount of money
     */
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        }
    }

    /**
     * Method to withdraw money
     * @param amt a positive amount of money
     */
    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
        }

    }

    /**
     * Method to check account balance
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
}
