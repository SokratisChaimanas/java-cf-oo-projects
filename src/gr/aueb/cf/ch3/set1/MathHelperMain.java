package gr.aueb.cf.ch3.set1;

public class MathHelperMain {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 62, 7, 8, 10, 15};

        int min = MathHelper.getMin(arr);
        int max = MathHelper.getMax(arr);
        double avg = MathHelper.getAverage(arr);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + avg);
    }
}
