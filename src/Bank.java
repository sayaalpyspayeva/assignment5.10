import java.util.ArrayList;

public class Bank {
    private String name;
    private int number;
    private ArrayList<Account> accounts;
    private ArrayList<ATM> ATMs;

    public Bank(String name, int number) {
        this.name = name;
        this.number = number;
        this.accounts = new ArrayList<>();
        this.ATMs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
        account.setBank(this);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public ArrayList<ATM> getATMs() {
        return ATMs;
    }

    public void addATM(ATM atm) {
        ATMs.add(atm);
        atm.setBank(this);
    }
}

