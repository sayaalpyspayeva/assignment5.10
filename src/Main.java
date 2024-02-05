public class Main {
    public static void main(String[] args) {
        // Create Bank
        Bank myBank = new Bank("MyBank", 123);

        // Create Accounts
        Account account1 = new Account(101, 1234);
        Account account2 = new Account(102, 5678);

        // Create ATMs
        ATM atm1 = new ATM();
        ATM atm2 = new ATM();
        ATM atm3 = new ATM();

        // Set property values
        myBank.addAccount(account1);
        myBank.addAccount(account2);

        myBank.addATM(atm1);
        myBank.addATM(atm2);
        myBank.addATM(atm3);

        atm1.setIdentificationNumber(111);
        atm1.setAddress("ATM Location 1");

        atm2.setIdentificationNumber(222);
        atm2.setAddress("ATM Location 2");

        atm3.setIdentificationNumber(333);
        atm3.setAddress("ATM Location 3");

        account1.replenishAccount(1000.0);

        // Display account status
        System.out.println("Account 1 Status:");
        System.out.println("Account Number: " + account1.getNumber());
        System.out.println("Balance: " + account1.getRemainder());

        // Withdraw from account
        account1.withdrawFromAccount(500.0);

        // Display updated account status
        System.out.println("Updated Account 1 Status:");
        System.out.println("Account Number: " + account1.getNumber());
        System.out.println("Balance: " + account1.getRemainder());

        // Test ATM withdrawal method
        atm1.withdrawMoneyFromAccount(1234, 200.0);
    }
}
