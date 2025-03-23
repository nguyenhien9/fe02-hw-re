package lesson12;

public class BankAccount {
    private double amount;


    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void fundout(double amount) throws InsufficientFundsException {
        if (amount > this.amount) {
            throw new InsufficientFundsException("Not enough balance in your account");
        }
        this.amount -= amount;
    }

}
