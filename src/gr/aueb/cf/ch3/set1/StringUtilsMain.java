package gr.aueb.cf.ch3.set1;

public class StringUtilsMain {

    public static void main(String[] args) {
        String s = "Anna";

        System.out.println("Given string is: " + s);
        System.out.println("It is palindrome: " + StringUtils.isPalindrome(s));
        System.out.println("In reverse: " + StringUtils.reverse(s));
        System.out.println("To upper case: " + StringUtils.toUpper(s));
    }
}
