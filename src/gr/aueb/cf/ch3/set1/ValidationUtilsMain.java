package gr.aueb.cf.ch3.set1;

public class ValidationUtilsMain {

    public static void main(String[] args) {
        int num1 = -1;
        int num2 = 4;
        String s1 = "";
        String s2 = "Hello";

        System.out.println("Num1: " + ValidationUtils.isValidNumber(num1));
        System.out.println("Num2: " + ValidationUtils.isValidNumber(num2));
        System.out.println("S1: " + ValidationUtils.hasValidLength(s1));
        System.out.println("S2: " + ValidationUtils.hasValidLength(s2));


    }
}
