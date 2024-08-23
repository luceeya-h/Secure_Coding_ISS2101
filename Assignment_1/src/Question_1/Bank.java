package Question_1; //collection of classes eg Bank, Main and Insurance
// access modifier
public class Bank {
    //Properties of the bank class
    String accountType;
    double accountBalance;

    // Parameterized constructor
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    // Deposit method
    double deposit(double amount) {
        accountBalance += amount;
        return accountBalance;
    }
    // Withdrawal method
    double withdrawal(double amount) {
        //control statement
        if (amount <= accountBalance) {
            accountBalance -= amount;
            return accountBalance;
            }
        else {
            System.out.println("Insufficient funds!");
            return accountBalance;
        }
    }
    // display method
    public void display() {
        System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
    }
}
