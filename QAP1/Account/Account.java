public class Account {
    private String id;
    private String name;
    private int balance;

    // Constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    // Credit: Adds amount to balance
    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    // Debit: Subtracts amount from balance if possible
    public int  debit(int amount) {
        if (amount<= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    // Transfer: Transfers amount to another account if possible
    public int transferTo (Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount); 
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString() {
        return ("Account [ID: " + this.id + ", Name: " + this.name + " and balance: " + this.balance + "]");
    }

    


}