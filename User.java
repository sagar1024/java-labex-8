import java.util.ArrayList;
import java.util.List;

class User extends FinancialTransactionManager{

    private String userId;
    private String userName;
    private List<Account> accounts;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.accounts = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}
