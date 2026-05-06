public class Account {
    protected String customerName;
    protected double balance;
    protected int accountID;

    private static int lastID = 1001;

    public Account(String customerName, double balance) {
        this.customerName = customerName;
        if(balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
        this.accountID = lastID;
        lastID++;
    } 
    
    public String getCustomerName() {
        return customerName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public int getAccountID() {
        return accountID;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void deposit(double a) {
        balance += a;
    }
    
    public void withdraw(double b) {
        if(balance >= b) {
            balance = balance - b;
        } else {
            System.out.println("Exceeds account's limits");
        }
    }

    public void printDetails() {
        System.out.println("Account Name: " + customerName);
        System.out.println("Account Number: " + accountID);
        System.out.println("Balance: " + balance);

    }
}
