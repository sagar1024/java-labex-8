class TransactionService {

    public static void main(String[] args) {

        FinancialTransactionManager transactionManager = new FinancialTransactionManager();

        User user1 = new User("1", "John Doe");
        Account account1 = new Account("A1", "Savings Account");
        user1.addAccount(account1);

        User user2 = new User("2", "Jane Smith");
        Account account2 = new Account("A2", "Checking Account");
        user2.addAccount(account2);

        transactionManager.addTransaction(new FinancialTransaction("Deposit", 1000, account1.getAccountId()));
        transactionManager.addTransaction(new FinancialTransaction("Withdrawal", 500, account1.getAccountId()));
        transactionManager.addTransaction(new FinancialTransaction("Purchase", 200, account2.getAccountId()));

        System.out.println("All Transactions: " + transactionManager.getAllTransactions());
        System.out.println("Transactions by Type: " + transactionManager.getTransactionsByType("Deposit"));
        System.out.println("Balance for Account A1: " + transactionManager.calculateBalanceForAccount(account1.getAccountId()));
    }
}
