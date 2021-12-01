public class BankTest {
    public static void main(String[] args){
        BankAccount user1 = new BankAccount("Carson");
        BankAccount user2 = new BankAccount("Tom");
        System.out.println("Total Accounts: " + BankAccount.accountTotal());

        // Deposit
        user1.depositChecking(20.00);
        user1.depositChecking(20.00);
        user1.depositSavings(20.00);

        user2.depositChecking(30.00);
        user2.depositSavings(25.00);

        // Withdraw
        user1.withdrawChecking(20.00);
        user1.withdrawSavings(20.00);
        user1.withdrawSavings(30.00);

        user2.withdrawSavings(5.00);

        // Total
        user1.total();
        user2.total();
    }
}
