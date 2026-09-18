package lab1;

public class AccountList {

    private Account[] accounts;
    private int count;

    public AccountList(int maxSize) {
        this.accounts = new Account[maxSize];
        this.count = 0;
    }

    public boolean appendAccount(Account acc) {
        if (count < accounts.length) {
            accounts[count] = acc;
            count++; 
            return true;
        } else {
            return false; 
        }
    }

    public Account getAccount(int idx) {
        if (idx >= 0 && idx < count) {
            return accounts[idx];
        } else {
            System.out.println("Input index exceeds the number of appended elements");
            return null;
        }
    }
}
