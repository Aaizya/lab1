public class task2 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 1 };
        int n = arr.length;
        double avg = getAverage(arr, n);
        System.out.println("The average is: " + avg);
    }

    /**
     * This function takes an integer array and its length as input and returns the
     * average of its elements as a double value.
     */
    public static double getAverage(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / n;
        return avg;
    }
}


