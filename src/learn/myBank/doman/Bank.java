package learn.myBank.doman;

public class Bank {

    private static Customer[] customers = new Customer[1000];
    private static int numOfClients = 0;

    private Bank(){
    }

    public static Customer getCustomer(int cusNo){
        if (cusNo < customers.length){
            return customers[cusNo];
        }
        return null;

    }

    public static void addCostumer(Customer newCostumer){
        customers[numOfClients]= newCostumer;
        numOfClients++;

    }

    public static int getNumOfClients() {
        return numOfClients;
    }
}
