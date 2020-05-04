package learn.myBank.doman;

public class Bank {

    private Customer[] customers;
    private int numOfClients;

    public Bank(){
        customers = new Customer[1000];
        numOfClients = 0;
    }

    public Customer getCustomer(int cusNo){
        if (cusNo < customers.length){
            return customers[cusNo];
        }
        return null;

    }

    public void addCostumer(Customer newCostumer){
        customers[numOfClients]= newCostumer;
        numOfClients++;

    }
}
