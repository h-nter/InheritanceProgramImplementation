public class InvestmentAccount extends Account {
    private String investmentType;

    public InvestmentAccount(String accountNumber, double balance, String ownerName, String investmentType) {
        super(accountNumber, balance, ownerName);
        this.investmentType = investmentType;
    }

    public void manageInvestment() {
        System.out.println("Managing " + investmentType + " investment for account " + getAccountNumber());
    }
}
