package learn.myBank.test;

import learn.myBank.doman.Account;



public class TestAccount {
    public static void main(String[] args) {
        Account myAccount = new Account(255.56);
        myAccount.deposit(120);
        myAccount.withdraw(120);
        myAccount.withdraw(400);
        System.out.printf("Account balance is $ %.2f", myAccount.getBalance());
    }
}
