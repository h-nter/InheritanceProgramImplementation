public class CheckingAccount extends Account {
    private boolean overdraftProtection;

    public CheckingAccount(String accountNumber, double balance, String ownerName, boolean overdraftProtection) {
        super(accountNumber, balance, ownerName);
        this.overdraftProtection = overdraftProtection;
    }

    public void setOverdraftProtection(boolean overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
        if (overdraftProtection)
            System.out.println("Overdraft protection enabled for account " + getAccountNumber());
        else
            System.out.println("Overdraft protection disabled for account " + getAccountNumber());
    }
}
