package gr.aueb.cf.ch3.set1;

/**
 * Is a utility class that offers methods for common math
 * functions such as search, find max/min and avg of an array
 * of integers.
 */
public class MathHelper {
    private MathHelper() {

    }

    public static int getMax(int[] arr) {
        if (isEmpty(arr)) return -1;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        if (isEmpty(arr)) return -1;

        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double getAverage(int[] arr) {
        if (isEmpty(arr)) return -1;

        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum/arr.length;
    }

    private static boolean isEmpty(int[] arr) {
        return arr.length == 0;
    }
}




















