import java.util.Arrays;

public class AssessmentReview {

    public static double cubed(int num) {
        return Math.pow(num, 3);
    }

    public static double difference(int num1, int num2) {
        return num1 - num2;
    }

    public static double difference(double num1, double num2) {
        return num1 - num2;
    }

    public static double median(int[] values) {
        Arrays.sort(values);
        double median;
        int totalElements = values.length;
        if (totalElements % 2 == 0) {
            int sumOfMidElements = values[totalElements / 2] + values[totalElements / 2 - 1];
            median = ((double) sumOfMidElements) / 2;
        } else {
            median = (double) values[values.length / 2];
        }
        return median;
    }

    public static void main(String[] args) {

        System.out.println(cubed(10));
        System.out.println(difference(35,10));
        System.out.println(difference(32.0,13.4));

        System.out.println(median(new int[]{2, 20, 3, 7, 7, 5, 8, 7, 10, 0}));
        System.out.println(median(new int[]{1, 3, 4, 2, 6, 5, 8, 7}));
    }

}
