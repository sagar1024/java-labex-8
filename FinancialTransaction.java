class FinancialTransaction extends FinancialTransactionManager {

    private String type;
    private double amount;
    private String accountId;

    public FinancialTransaction(String type, double amount, String accountId) {
        this.type = type;
        this.amount = amount;
        this.accountId = accountId;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getAccountId() {
        return accountId;
    }
}
