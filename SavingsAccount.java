public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, String ownerName, double interestRate) {
        super(accountNumber, balance, ownerName);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interestAmount = getBalance() * interestRate / 100;
        deposit(interestAmount);
        System.out.println("Interest of $" + interestAmount + " applied to account " + getAccountNumber());
    }
}
