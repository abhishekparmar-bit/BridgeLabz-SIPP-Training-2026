abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public int getAccountNumber() { return accountNumber; }
    public void setAccountNumber(int n) { accountNumber = n; }
    public String getHolderName() { return holderName; }
    public void setHolderName(String h) { holderName = h; }
    public double getBalance() { return balance; }
    public void setBalance(double b) { balance = b; }

    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) { if(amt<=balance) balance -= amt; }
    public void displayAccountDetails() {
        System.out.println("Acc#: "+accountNumber+", Holder: "+holderName+", Balance: "+balance);
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    public void setInterestRate(double r) { interestRate = r; }
    double calculateInterest() { return getBalance() * interestRate / 100; }
}

class CurrentAccount extends BankAccount {
    private double monthlyBonusRate;
    public void setMonthlyBonusRate(double r) { monthlyBonusRate = r; }
    double calculateInterest() { return getBalance() * monthlyBonusRate / 100; }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.setAccountNumber(101); s.setHolderName("Ankit"); s.setBalance(10000); s.setInterestRate(5);
        s.deposit(2000); s.withdraw(3000); s.displayAccountDetails();
        System.out.println("Interest: "+s.calculateInterest());

        CurrentAccount c = new CurrentAccount();
        c.setAccountNumber(202); c.setHolderName("Ravi"); c.setBalance(20000); c.setMonthlyBonusRate(2);
        c.deposit(5000); c.withdraw(4000); c.displayAccountDetails();
        System.out.println("Interest: "+c.calculateInterest());
    }
}
