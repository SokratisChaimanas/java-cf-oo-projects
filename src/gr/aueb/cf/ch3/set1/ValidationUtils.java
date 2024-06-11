package gr.aueb.cf.ch3.set1;

/**
 * Utility class for simple validation.
 */
public class ValidationUtils {
    private ValidationUtils() {

    }

    public static boolean hasValidLength(String str) {
        return (!str.isEmpty() && !(str.length() >31));
    }

    public static boolean isValidNumber(int num) {
        return (!(num < 1 )&& !(num > 10));
    }
}












