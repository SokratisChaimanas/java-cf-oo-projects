package gr.aueb.cf.ch3.set1;

/**
 * Utility class for simple string manipulation.
 */
public class StringUtils {

    private StringUtils() {

    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String toUpper(String str) {
        return str.toUpperCase();
    }

    public static boolean isPalindrome(String str) {
        str = str.toUpperCase();

        for (int start = 0, end = (str.length() - 1); start < end; start++, end--) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
        }
        return true;
    }
}













