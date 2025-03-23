package lesson12;

public class HW08 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        double amountToWithdraw = 600;
        System.out.println("Start withdrawing " + amountToWithdraw);
        try{
            account.fundout(amountToWithdraw);
            System.out.println("Successfully withdrawn " + amountToWithdraw);

        }catch (InsufficientFundsException e){
            System.err.println("Withdrawing failed: " + e.getMessage());
        }
    }
}
