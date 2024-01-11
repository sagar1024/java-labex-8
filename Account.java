class Account extends FinancialTransactionManager {

    private String accountId;
    private String ownerName;

    public Account(String accountId, String ownerName) {
        this.accountId = accountId;
        this.ownerName = ownerName;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
