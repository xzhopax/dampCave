package learn.myBank.test;

import learn.myBank.doman.*;


public class TestAccount {
    public static void main(String[] args) {

        Customer firstCustomer = new Customer("John Doe");
        Customer secondCustomer = new Customer("Jean Doe");

        SavingsAccount johnSavings = new SavingsAccount(1000,5);
        CheckingAccount johnAccount = new CheckingAccount(5000,1000);
        CheckingAccount jeanAccount = new CheckingAccount(500,100);


        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(jeanAccount);
        Bank.addCostumer(firstCustomer);
        Bank.addCostumer(secondCustomer);

        System.out.println(Bank.getCustomer(0));
        Bank.getCustomer(0).getAccount(0).deposit(2000);
        Bank.getCustomer(0).getAccount(1).withdraw(5500);
        ((SavingsAccount)Bank.getCustomer(0).getAccount(0)).addInterestRate();

        System.out.println(Bank.getCustomer(0).getAccount(0).getBalance());
        System.out.println(Bank.getCustomer(0).getAccount(1).getBalance());





    }
}
