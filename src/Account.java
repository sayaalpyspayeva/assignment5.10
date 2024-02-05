public class Account {
    private int number;
    private int PINCode;
    private double remainder;
    private Bank bank;

    public Account(int number, int PINCode) {
        this.number = number;
        this.PINCode = PINCode;
        this.remainder = 0.0;
    }

    public int getNumber() {
        return number;
    }

    public int getPINCode() {
        return PINCode;
    }

    public double getRemainder() {
        return remainder;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void replenishAccount(double amount) {
        remainder += amount;
    }

    public void withdrawFromAccount(double amount) {
        if (amount <= remainder) {
            remainder -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + remainder);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
