import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FinancialTransactionManager {

    private List<FinancialTransaction> transactions;
    private Map<String, List<FinancialTransaction>> transactionsByType;

    public FinancialTransactionManager() {
        transactions = new ArrayList<>();
        transactionsByType = new HashMap<>();
    }

    public void addTransaction(FinancialTransaction transaction) {
        transactions.add(transaction);
        transactionsByType
                .computeIfAbsent(transaction.getType(), k -> new ArrayList<>())
                .add(transaction);
    }

    public List<FinancialTransaction> getAllTransactions() {
        return new ArrayList<>(transactions);
    }

    public List<FinancialTransaction> getTransactionsByType(String type) {
        return transactionsByType.getOrDefault(type, new ArrayList<>());
    }

    // Method to calculate the total balance of an account
    public double calculateBalanceForAccount(String accountId) {
        List<FinancialTransaction> accountTransactions = getTransactionsByAccount(accountId);
        return accountTransactions.stream().mapToDouble(FinancialTransaction::getAmount).sum();
    }

    // Method to retrieve transactions by account
    public List<FinancialTransaction> getTransactionsByAccount(String accountId) {
        // Each transaction is associated with an account ID
        List<FinancialTransaction> accountTransactions = new ArrayList<>();
        for (FinancialTransaction transaction : transactions)
        {
            if (accountId.equals(transaction.getAccountId()))
            {
                accountTransactions.add(transaction);
            }
        }
        return accountTransactions;
    }
}
