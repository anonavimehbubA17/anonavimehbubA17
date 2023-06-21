public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        ATMSystem atmSystem = new ATMSystem(bank);

        SavingsAccount savingsAccount = new SavingsAccount(123456, 1000.0, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(789012, 2000.0, 500.0);

        bank.createAccount(savingsAccount);
        bank.createAccount(currentAccount);

        atmSystem.login();
        atmSystem.deposit(500.0);
        atmSystem.withdraw(200.0);
        atmSystem.getBalance();
        atmSystem.logout();
    }
}