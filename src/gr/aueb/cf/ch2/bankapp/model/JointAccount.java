package gr.aueb.cf.ch2.bankapp.model;

/**
 * The {@link  JointAccount} class represents a bank account shared by two owners.
 * It contains fields for the account details of both owners and the account balance,
 * and provides methods for depositing and withdrawing money, as well as utility methods
 * to validate SSN, check for negative amounts, and verify if the balance is sufficient.
 */

public class JointAccount {
    private int id;
    private String firstname1;
    private String lastname1;
    private String iban1;
    private String idNumber1;
    private String ssn1;
    private String firstname2;
    private String lastname2;
    private String iban2;
    private String idNumber2;
    private String ssn2;
    private int balance;

    public JointAccount() {

    }

    public JointAccount(int id, String firstname1, String lastname1, String iban1, String idNumber1, String ssn1,
                        String firstname2, String lastname2, String iban2, String idNumber2, String ssn2, int balance) {
        this.id = id;
        this.firstname1 = firstname1;
        this.lastname1 = lastname1;
        this.iban1 = iban1;
        this.idNumber1 = idNumber1;
        this.ssn1 = ssn1;
        this.firstname2 = firstname2;
        this.lastname2 = lastname2;
        this.iban2 = iban2;
        this.idNumber2 = idNumber2;
        this.ssn2 = ssn2;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname1() {
        return firstname1;
    }

    public void setFirstname1(String firstname1) {
        this.firstname1 = firstname1;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getIban1() {
        return iban1;
    }

    public void setIban1(String iban1) {
        this.iban1 = iban1;
    }

    public String getIdNumber1() {
        return idNumber1;
    }

    public void setIdNumber1(String idNumber1) {
        this.idNumber1 = idNumber1;
    }

    public String getSsn1() {
        return ssn1;
    }

    public void setSsn1(String ssn1) {
        this.ssn1 = ssn1;
    }

    public String getFirstname2() {
        return firstname2;
    }

    public void setFirstname2(String firstname2) {
        this.firstname2 = firstname2;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public String getIban2() {
        return iban2;
    }

    public void setIban2(String iban2) {
        this.iban2 = iban2;
    }

    public String getIdNumber2() {
        return idNumber2;
    }

    public void setIdNumber2(String idNumber2) {
        this.idNumber2 = idNumber2;
    }

    public String getSsn2() {
        return ssn2;
    }

    public void setSsn2(String ssn2) {
        this.ssn2 = ssn2;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    /**
     * Performs the deposit of an amount into a {@link JointAccount} object.
     *
     * @param amount
     *      the amount that gets deposited.
     * @throws Exception
     *      if the amount is negative.
     */
    public void deposit(int amount) throws Exception {
        try {
            if (isAmountNegative(amount)) throw new Exception("Negative Amount");
            balance += amount;
            System.out.println("Successful deposit");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Performs the withdrawal of an amount from a {@link JointAccount} object.
     *
     * @param amount
     *      the amount to be withdrawn.
     * @param ssn
     *      the given ssn.
     * @throws Exception
     *      if the given ssn doesn't match the ssn of either owner,
     *      if the amount is negative,
     *      if the balance is not enough.
     */
    public void withdraw(int amount, String ssn) throws Exception {
        try {
            if (!isSsnValid(ssn)) throw new Exception("Invalid Ssn");
            if (isAmountNegative(amount)) throw new Exception("Negative amount");
            if (!isEnoughBalance(amount)) throw new Exception("Not enough balance into account");

            balance -= amount;
            System.out.println("Withdrawal was successful");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Checks if a given ssn matches that of either owner of a {@link JointAccount} object.
     *
     * @param ssn
     *      the given ssn
     * @return
     *      true if the ssn matches, false otherwise
     */
    private boolean isSsnValid (String ssn) {
        return ssn1.equals(ssn) || ssn2.equals(ssn);
    }

    /**
     * Checks if a given amount is negatice.
     *
     * @param amount
     *      the given amount.
     * @return
     *      true if negatice, false otherwise.
     */
    private boolean isAmountNegative(int amount) {
        return amount < 0;
    }

    /**
     * Checks if a given amount exceeds the balance of a {@link JointAccount} object.
     *
     * @param amount
     *      the given amount.
     * @return
     *      true if the balance exceeds the amount, false otherwise.
     */
    private boolean isEnoughBalance(int amount) {
        return balance >= amount;
    }

}
