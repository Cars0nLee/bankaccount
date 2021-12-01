public class BankAccount{
    private String name;
    private double checking;
    private double savings;
    private static int numberOfAccounts = 0;
    private static double total = 0.0;

    // Constructor
    public BankAccount(String name) {
        this.name = name;
        numberOfAccounts++;
    }

    // Methods
    public static int accountTotal() {
        return numberOfAccounts;
    }
    public void depositChecking(double deposit) {
        this.checking += deposit;
        total += deposit;
        System.out.println( name + " deposited: $" + deposit);
        System.out.println("Your new checking account balance: $" + getChecking());
        System.out.println("Your total account balance is: $" + (getChecking() + getSavings()));
    }
    public void depositSavings(double deposit) {
        this.savings += deposit;
        total += deposit;
        System.out.println(name + " deposited: $" + deposit);
        System.out.println("Your new savings account balance: $" + getSavings());
        System.out.println("Your total account balance is: $" + (getChecking() + getSavings()));
    }
    public void withdrawChecking(double spend) {
        if(this.checking - spend < 0){
            System.out.println("Insufficient funds, deposit money!");
        }
        else {
            this.checking -= spend;
            total -= spend;
            System.out.println("New checking balance is: " + checking);
            System.out.println("New total balance is: " + (getChecking() + getSavings()));
        }
    }
    public void withdrawSavings(double spend) {
        if(this.savings - spend < 0){
            System.out.println("Insufficient funds, deposit money!");
        }
        else {
            this.savings -= spend;
            total -= spend;
            System.out.println("New checking balance is: " + savings);
            System.out.println("New total balance is: " + (getChecking() + getSavings()));
        }
    }
    public void total() {
        System.out.println(name + " total of all account balance: " + (getChecking() + getSavings()));
    }
    public void getAll() {
        System.out.println(total);
    }

    // Getter
    public double getChecking() {
        return checking;
    }
    public double getSavings() {
        return savings;
    }
}

