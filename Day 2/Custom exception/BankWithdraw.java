
public class BankWithdraw {
    private double balance = 1000;
    
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Available: $" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: $" + balance);
    }
    
    public static void main(String[] args) {
        BankWithdraw bank = new BankWithdraw();
        try {
            bank.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}