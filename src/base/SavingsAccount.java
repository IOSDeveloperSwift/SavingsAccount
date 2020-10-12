package base;

public class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(int savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest() {
        double monthlyBenefit = (savingsBalance * annualInterestRate) / 12;
        savingsBalance = monthlyBenefit;
        return savingsBalance;
    }

    static void modifyInterestRate(int newInterestRate) {
        annualInterestRate = newInterestRate;
    }

}
