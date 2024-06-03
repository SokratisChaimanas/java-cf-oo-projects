package gr.aueb.cf.ch2.bankapp.model;

/**
 * The {@link OverFraftAccount} class represents a bank account that allows
 * overdrafts. It contains fields for the account holder's information,
 * balance, and loan amount, and provides methods for depositing and
 * withdrawing money, as well as utility methods to validate SSN and check
 * for negative amounts.
 */

public class OverFraftAccount {
    private int id;
    private String firstname;
    private String lastname;
    private String iban;
    private String idNumber;
    private String ssn;
    private int balance;
    private int loanAmount;

    public OverFraftAccount () {

    }

    public OverFraftAccount(int id, String firstname, String lastname,
                            String ssn, String iban, String idNumber, int balance) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.iban = iban;
        this.idNumber = idNumber;
        this.balance = balance;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }


    /**
     * Deposits an amount in an {@link OverFraftAccount} object.
     *
     * @param amount
     *      the amount that gets deposited.
     * @throws Exception
     *      if amount is negative.
     */
    public void deposit(int amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("Negative amount");
            balance =+ amount;
            System.out.println("The deposit was successful.");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraws money from an {@link OverFraftAccount} if the balance of the account does
     * not cover the amount the money gets loaned to the user.
     *
     * @param amount
     *      the amount to be withdrawn.
     * @param ssn
     *      the ssn that performs the action
     * @throws Exception
     *      if the given ssn does not match the ssn of the owner,
     *      or if the given amount is negative.
     */
    public void withdraw(int amount, String ssn) throws Exception{
        try {
            if (!isValidSsn(ssn)) throw new Exception("Invalid ssn");
            if (isAmountNegative(amount)) throw new Exception(("Negative Amount"));
            if (amount > balance) {
                int loan = Math.abs(balance - amount);
                int withdrewFromAcc = amount - loan;
                loanAmount += loan;
                balance = 0;
                System.out.printf("Successfully withdrew %d from your account and loaned %d.\n", withdrewFromAcc, loan);
                return;
            }
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + " from your account");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the state of an {@link  OverFraftAccount} object in
     * a string format.
     *
     * @return
     *      the String representation of the state.
     */
    public String acountToString() {
        return "(" + iban + ", " +firstname + ", " +lastname
                + ", " + ssn + ", " + balance + ", " + loanAmount +  ")";
    }

    /**
     * Checks if a given ssn matches the ssn of a {@link OverFraftAccount} object.
     *
     * @param ssn
     *      the given ssn.
     * @return
     *      true if ssn matches the owner's ssn, false otherwise.
     */
    private boolean isValidSsn(String ssn) {
        return this.ssn.equals(ssn);
    }

    /**
     * Checks if a given amount is negative.
     *
     * @param amount
     *      the given amount.
     * @return
     *      true if negative, false otherwise.
     */
    private boolean isAmountNegative(int amount) {
        return amount < 0;
    }

}
