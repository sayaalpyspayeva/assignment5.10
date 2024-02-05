public class ATM {
    private int identificationNumber;
    private String address;
    private Bank bank;

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void withdrawMoneyFromAccount(int pinCode, double amount) {
        for (Account account : bank.getAccounts()) {
            if (account.getPINCode() == pinCode) {
                account.withdrawFromAccount(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }
}
