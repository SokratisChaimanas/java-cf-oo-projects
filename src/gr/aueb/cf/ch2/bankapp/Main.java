package gr.aueb.cf.ch2.bankapp;

import gr.aueb.cf.ch2.bankapp.model.JointAccount;
import gr.aueb.cf.ch2.bankapp.model.OverFraftAccount;

/**
 * Driver class that demonstrates the use of {@link OverFraftAccount} and
 * {@link JointAccount} classes.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        OverFraftAccount myOverFraftAccount = new OverFraftAccount(1, "Sokratis", "Ch.",
                "123", "456", "A123", 100);

        JointAccount myJointAccount = new JointAccount(1, "Alice", "W.", "123", "456", "A332",
                "Bob", "D.", "321", "B12", "451", 1000);

        // Demo of OverfraftAccount.
        try {
            System.out.println("The state of the Overfraft Account is: " + myOverFraftAccount.acountToString());
            myOverFraftAccount.deposit(5000);
            myOverFraftAccount.withdraw(10000, "123");

            System.out.println("The new state of the Overfraft Account is: " + myOverFraftAccount.acountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Demo of JointAccount.
        try {
            System.out.println("The balance of the Joint Account is: " + myJointAccount.getBalance());
            myJointAccount.deposit(100);
            myJointAccount.withdraw(400, "451");

            System.out.println("The new balance of the Joint Account is: " + myJointAccount.getBalance());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

















    }

}
