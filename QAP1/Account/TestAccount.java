public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts using the parameterized constructors
        Account acc1 = new Account("A123", "John Gbadamosi", 5000);
        Account acc2 = new Account("B456", "Faith Doe", 4000);

        // Display the balance of both accounts
        System.out.println("\nInitial Balances:");
        System.out.println("Account 1 Balance: " + acc1.getBalance()); 
        System.out.println("Account 2 Balance: " + acc2.getBalance());

        // Transfer $1000 from acc1 to acc2
        System.out.println("\nTransferring $1000 from Account 1 to Account 2");
        acc1.transferTo(acc2, 1000);

        // Display the balance of both accounts after the transfer
        System.out.println("\nBalances after Transfer:");
        System.out.println("Account 1 Balance: " + acc1.getBalance()); 
        System.out.println("Account 2 Balance: " + acc2.getBalance() + "\n"); 
    }
}
