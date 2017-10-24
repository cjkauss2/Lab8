//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * Checking account enum constant.
         */
        CHECKINGS,

        /**
         * Savings account enum constant.
         */
        SAVINGS,

        /**
         * Student account enum constant.
         */
        STUDENT,

        /**
         * Workplace account enum constant.
         */
        WORKPLACE
    }

    /**
     * Account's unique id.
     */
    private final int accountNumber;

    /**
     * Account's type.
     */
    private BankAccountType accountType;

    /**
     * Account's balance.
     */
    private double accountBalance;

    /**
     * Name of account's owner.
     */
    private String ownerName;

    /**
     * Account's interest rate.
     */
    private double interestRate;

    /**
     * Account's total interest earned.
     */
    private double interestEarned;

    /**
     * BankAccount constructor that initializes the owner's name and the account type
     * using given parameters.
     * @param name account owner's name
     * @param accountCategory account's type
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        accountNumber = Bank.getNumberOfAccount();
        Bank.addAccount();
        accountType = accountCategory;
        accountBalance = 0.0;
        ownerName = name;
        interestRate = 0.0;
        interestEarned = 0.0;
    }

    /*
     * Getters and setters:
     */

    /**
     * accountNumber getter.
     * @return the account's unique id
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * accountType getter.
     * @return the account's type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * accountBalance getter.
     * @return the account's balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * ownerName getter.
     * @return the name of account owner
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * interestRate getter.
     * @return the account's interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * accountNumber getter.
     * @return the account's unique id
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * accountBalance setter.
     * @param amount the amount to set account balance to
     */
    public void setAccountBalance(final double amount) {
        accountBalance = amount;
    }

    /**
    * accountBalance setter.
    * @param name the new name of account owner
    */
   public void setOwnerName(final String name) {
       ownerName = name;
   }
}
