package africa.semicolon.tddClass;

public class Account {
    private double myAccountBalance;
    public void deposit(double amountToDeposit) {
        myAccountBalance = myAccountBalance + amountToDeposit;
    }

    public double getAccountBalance() {
        return myAccountBalance;
    }
}
