package gr.aueb.cf.ch1;

import gr.aueb.cf.ch1.model.User;
import gr.aueb.cf.ch1.model.UserCredentials;

public class Main {

    public static void main(String[] args) {
        User myUser = new User(1, "Sokratis", "Ch.", "1234");
        UserCredentials myCredentials = new UserCredentials(1, "Sokratiso", "1234");

        System.out.print("myUser: ");
        System.out.println("{" + myUser.getId() + ", " + myUser.getFirstname() + ", " + myUser.getLastname() + ", " + myUser.getPassword() + "}");
        System.out.print("myCredentials: ");
        System.out.println("{" + myCredentials.getId() + ", " + myCredentials.getUsername() + ", " + myCredentials.getPassword() + "}");
    }
}
